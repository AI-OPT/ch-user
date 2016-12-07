package com.ai.ch.user.api.audit.params;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseInfo;

public class QueryAuditLogInfoRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * pageSize
	 */
	private Integer pageSize;

	/**
	 * pageNo
	 */
	private Integer pageNo;

	/**
	 * 开始时间
	 */
	private Timestamp beginTime;

	/**
	 * 结束时间
	 */
	private Timestamp endTime;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

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

}
