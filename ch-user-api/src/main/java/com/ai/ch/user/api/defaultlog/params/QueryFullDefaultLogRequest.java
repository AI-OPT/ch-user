package com.ai.ch.user.api.defaultlog.params;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 查询全量扣款信息入参 Date: 2016年11月8日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryFullDefaultLogRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * 可选
	 */
	private String userId;

	/**
	 * 可选
	 */
	private Timestamp beginTime;

	/**
	 * 可选
	 */
	private Timestamp endTime;

	private Integer pageNo;

	private Integer pageSize;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
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