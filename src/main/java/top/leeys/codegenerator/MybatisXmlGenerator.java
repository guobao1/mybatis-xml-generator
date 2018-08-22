package top.leeys.codegenerator;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Mybatis XML生成器
 * 
 * @author leeys.top@gmail.com
 *
 */
public class MybatisXmlGenerator {
    
    private static VelocityEngine engine = new VelocityEngine();
    
    static {
        engine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        engine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        engine.init();
    }
    
    public static class XmlData {
        /** 表名 */
        public String tableName;
        
        /** dao类完全限定名称 */
        public String daoName;
        
        /** 实体类完全限定名称 */
        public String entityName;
        
        /** 逻辑删除字段名 status or deleted */
        public String deleteFieldName = "status";
        
        /** 字段元组 */
        public final List<Tuple<String, String>> fields = new LinkedList<>();

        public String getTableName() {
            return tableName;
        }

        public String getDaoName() {
            return daoName;
        }

        public String getEntityName() {
            return entityName;
        }

        public String getDeleteFieldName() {
            return deleteFieldName;
        }

        public List<Tuple<String, String>> getFields() {
            return fields;
        }
    }
    
    public static class Tuple<L, R> {
        private final L left;
        private final R right;
        
        public Tuple(L left, R right) {
            this.left = left;
            this.right = right;
        }
        
        public L getLeft() {
            return left;
        }

        public R getRight() {
            return right;
        }
    }
    
    /**
     * 驼峰转下划线
     */
    public static String getSnakeCase(String camelCase) {
        if (camelCase == null)
            return null;
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("[A-Z]?[a-z]*[^A-Z]");
        Matcher matcher = pattern.matcher(camelCase);
        while (matcher.find()) {
            sb.append(matcher.group().toLowerCase()).append("_");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }
    
    /**
     * 
     * @param templateName vm模板文件名
     * @param tableName 表名
     * @param path 类路径，到.model.的上一层
     * @param entityClassName 实体类名字
     * @param ignoreFields 忽略的实体字段
     * @return
     */
    public static String generateXml(String templateName, String tableName, String path,
                                     String entityClassName, String... ignoreFields) throws ClassNotFoundException {
        Set<String> ignoresSet = new HashSet<>();
        Collections.addAll(ignoresSet, ignoreFields);
        
        XmlData data = new XmlData();
        data.tableName = tableName;
        data.entityName = path + ".model." + entityClassName;
        data.daoName = path + ".dao." + entityClassName;

        Class entityClz = Class.forName(data.entityName);

        Field[] fields = entityClz.getDeclaredFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers()) || ignoresSet.contains(field.getName()))
                continue;
            data.fields.add(new Tuple<>(field.getName(), getSnakeCase(field.getName())));
        }
        
        VelocityContext ctx = new VelocityContext();
        ctx.put("data", data);
        StringWriter writer = new StringWriter();
        Template template = engine.getTemplate(templateName, "UTF-8");
        template.merge(ctx, writer);
        return writer.toString();
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        String xml =  generateXml("mybatis-xml.vm", "rental_housing",
                "com.aidynamic.maiquan.core", "RentalHousing");

        System.out.println(xml);
    }
}
