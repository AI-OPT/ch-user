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
	 * 审核状态
	 */
	private String auditStatus;

	/**
	 * 用户类型
	 */
	private String ctType;

	/**
	 * 用户id
	 */
	private String userName;

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

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCtType() {
		return ctType;
	}

	public void setCtType(String ctType) {
		this.ctType = ctType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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
