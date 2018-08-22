package com.aidynamic.maiquan.core.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * @author maguobao
 */
public class RentalHousing implements Serializable {


	private static final long serialVersionUID = 1534494736977L;


	/**
	 * 主键
	 * 出租房id
	 * isNullAble:0
	 */
	private Long id;

	/**
	 * 出租房编号
	 * isNullAble:1
	 */
	private String number;

	/**
	 * 出租标题
	 * isNullAble:1
	 */
	private String title;

	/**
	 * 合同编号(收房合同编号)
	 * isNullAble:1
	 */
	private String receivedContractNumber;

	/**
	 * 房源编号
	 * isNullAble:1
	 */
	private String houseNumber;

	/**
	 * 房源地址省
	 * isNullAble:1
	 */
	private String houseAddressProvince;

	/**
	 * 房源地址 市
	 * isNullAble:1
	 */
	private String houseAddressCity;

	/**
	 * 房源地址 小区
	 * isNullAble:1
	 */
	private String houseAddressDistrict;

	/**
	 * 房源地址 街道
	 * isNullAble:1
	 */
	private String houseAddressStreet;

	/**
	 * 房源地址  详情
	 * isNullAble:1
	 */
	private String houseAddressDetail;

	/**
	 * 出租房面积
	 * isNullAble:1
	 */
	private Double area;

	/**
	 * 租金价格
	 * isNullAble:1
	 */
	private Long rentalForMonth;

	/**
	 * 首付方式押__
	 * isNullAble:1
	 */
	private Integer severalPaid;

	/**
	 * 首付方式押一付___
	 * isNullAble:1
	 */
	private Integer severalDeposit;

	/**
	 * 支付方式  1月 2季 3半年 4年
	 * isNullAble:1
	 */
	private Integer payType;

	/**
	 * 出租方式  1 整租 2合租
	 * isNullAble:1
	 */
	private Integer rentalType;

	/**
	 * 房屋配置 (字符串类型)
	 * isNullAble:1
	 */
	private String allocation;

	/**
	 * 房屋卖点
	 * isNullAble:1
	 */
	private String sellingPoint;

	/**
	 * 出租合同id
	 * isNullAble:1
	 */
	private Long receivedContractId;

	/**
	 * 图片预览地址
	 * isNullAble:1
	 */
	private String imageUrls;

	/**
	 * 图片数量
	 * isNullAble:1
	 */
	private Integer imageCount;

	/**
	 * 是否下架（1是、0否）
	 * isNullAble:1
	 */
	private Integer isDown;

	/**
	 * 是否删除 (1是、0否）
	 * isNullAble:1
	 */
	private Integer isDelete;

	/**
	 * 数据创建时间
	 * isNullAble:1
	 */
	private Date gmtCreate;

	/**
	 * 数据修改时间
	 * isNullAble:1
	 */
	private Date gmtModified;

	/**
	 * 提交人/创建人/创建数据的时间
	 * isNullAble:1
	 */
	private String operator;

	/**
	 * 图片名称
	 * isNullAble:1
	 */
	private String imgName;

	/**
	 * 出租状态  1 出租中， 2 空置中
	 * isNullAble:1
	 */
	private Integer status;

	/**
	 * 标签   /介绍
	 * isNullAble:1
	 */
	private String tag;

	/**
	 * 平台  (数组类型)
	 * isNullAble:1
	 */
	private String board;

	/**
	 * 是否在平台  (1是、0否）
	 * isNullAble:1
	 */
	private Integer isBoard;

	/**
	 * 第三方平台出租状态 1出租中 2、待出租
	 * isNullAble:1
	 */
	private Integer boardStatus;

	/**
	 * 是否整租 1整租 2合租
	 * isNullAble:1
	 */
	private Integer isFull;

	/**
	 * 几室 保证是int类型
	 * isNullAble:1
	 */
	private Integer room;

	/**
	 * 几厅
	 * isNullAble:1
	 */
	private String hall;

	/**
	 * 几个卫生间
	 * isNullAble:1
	 */
	private String toilet;

	/**
	 * 朝向
	 * isNullAble:1
	 */
	private String orientation;

	/**
	 * 特色    json 数组
	 * isNullAble:1
	 */
	private String feature;

	/**
	 * 价格信息
	 * isNullAble:1
	 */
	private String priceMessage;

	/**
	 * 出房管家
	 * isNullAble:1
	 */
	private String steward;

	private String ownerName;

	private List<RentHousingPicture> houses;


	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public List<RentHousingPicture> getHouses() {
		return houses;
	}

	public void setHouses(List<RentHousingPicture> houses) {
		this.houses = houses;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReceivedContractNumber() {
		return receivedContractNumber;
	}

	public void setReceivedContractNumber(String receivedContractNumber) {
		this.receivedContractNumber = receivedContractNumber;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getHouseAddressProvince() {
		return houseAddressProvince;
	}

	public void setHouseAddressProvince(String houseAddressProvince) {
		this.houseAddressProvince = houseAddressProvince;
	}

	public String getHouseAddressCity() {
		return houseAddressCity;
	}

	public void setHouseAddressCity(String houseAddressCity) {
		this.houseAddressCity = houseAddressCity;
	}

	public String getHouseAddressDistrict() {
		return houseAddressDistrict;
	}

	public void setHouseAddressDistrict(String houseAddressDistrict) {
		this.houseAddressDistrict = houseAddressDistrict;
	}

	public String getHouseAddressStreet() {
		return houseAddressStreet;
	}

	public void setHouseAddressStreet(String houseAddressStreet) {
		this.houseAddressStreet = houseAddressStreet;
	}

	public String getHouseAddressDetail() {
		return houseAddressDetail;
	}

	public void setHouseAddressDetail(String houseAddressDetail) {
		this.houseAddressDetail = houseAddressDetail;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Long getRentalForMonth() {
		return rentalForMonth;
	}

	public void setRentalForMonth(Long rentalForMonth) {
		this.rentalForMonth = rentalForMonth;
	}

	public Integer getSeveralPaid() {
		return severalPaid;
	}

	public void setSeveralPaid(Integer severalPaid) {
		this.severalPaid = severalPaid;
	}

	public Integer getSeveralDeposit() {
		return severalDeposit;
	}

	public void setSeveralDeposit(Integer severalDeposit) {
		this.severalDeposit = severalDeposit;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getRentalType() {
		return rentalType;
	}

	public void setRentalType(Integer rentalType) {
		this.rentalType = rentalType;
	}

	public String getAllocation() {
		return allocation;
	}

	public void setAllocation(String allocation) {
		this.allocation = allocation;
	}

	public String getSellingPoint() {
		return sellingPoint;
	}

	public void setSellingPoint(String sellingPoint) {
		this.sellingPoint = sellingPoint;
	}

	public Long getReceivedContractId() {
		return receivedContractId;
	}

	public void setReceivedContractId(Long receivedContractId) {
		this.receivedContractId = receivedContractId;
	}

	public String getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(String imageUrls) {
		this.imageUrls = imageUrls;
	}

	public Integer getImageCount() {
		return imageCount;
	}

	public void setImageCount(Integer imageCount) {
		this.imageCount = imageCount;
	}

	public Integer getIsDown() {
		return isDown;
	}

	public void setIsDown(Integer isDown) {
		this.isDown = isDown;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsBoard() {
		return isBoard;
	}

	public void setIsBoard(Integer isBoard) {
		this.isBoard = isBoard;
	}

	public Integer getBoardStatus() {
		return boardStatus;
	}

	public void setBoardStatus(Integer boardStatus) {
		this.boardStatus = boardStatus;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}
}
