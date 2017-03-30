package com.ai.ch.user.vo;

import java.sql.Timestamp;

public class CtAuditLogVo {

	/**
	 * 租户id
	 */
	private String tenantId;
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

	/**
	 * 排序
	 */
	private String orderByClause;

	/**
	 * 分页起始
	 */
	private Integer LimitStart;
	/**
	 * 分页结束
	 */
	private Integer LimitEnd;

	public Integer getLimitStart() {
		return LimitStart;
	}

	public void setLimitStart(Integer limitStart) {
		LimitStart = limitStart;
	}

	public Integer getLimitEnd() {
		return LimitEnd;
	}

	public void setLimitEnd(Integer limitEnd) {
		LimitEnd = limitEnd;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
