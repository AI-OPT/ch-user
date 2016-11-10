package com.ai.ch.user.api.defaultlog.params;

import java.io.Serializable;

/**
 * 查询全量扣款信息入参 Date: 2016年11月8日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryFullDefaultLogRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 可选
	 */
	private String userId;

	/**
	 * 可选
	 */
	private String beginTime;

	/**
	 * 可选
	 */
	private String endTime;

	private Integer pageNo;

	private Integer pageSize;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}