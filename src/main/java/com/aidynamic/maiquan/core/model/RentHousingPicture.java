package com.aidynamic.maiquan.core.model;

import java.util.Date;

/**
 * @author maguobao
 * @date 2018/08/06
 * @time 16:49
 */
public class RentHousingPicture {

	private Long id;

	/**
	 * 出租房图片
	 */
	private String name;

	/**
	 * 图片链接
	 */
	private String urls;

	/**
	 * 创建日期
	 * isNullAble:1
	 */
	private Date gmtCreate;

	/**
	 * 最近更新日期
	 * isNullAble:1
	 */
	private Date gmtModified;

	/**
	 * 记录创建人
	 * isNullAble:1
	 */
	private String creater;
	/**
	 * 出租房id
	 */
	private  Long rentHousingId;

	public Long getRentHousingId() {
		return rentHousingId;
	}

	public void setRentHousingId(Long rentHousingId) {
		this.rentHousingId = rentHousingId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
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

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

}
