package com.ai.ch.user.api.audit.params;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 审核记录查询 Date: 2016年12月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryAuditInfoResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 租户id
	 */
	private String tenantId;

	/**
	 * 类型
	 */
	private String ctType;

	/**
	 * 审核状态
	 */
	private String auditStatus;

	/**
	 * 操作员id
	 */
	private String operId;

	/**
	 * 操作员姓名
	 */
	private String operName;

	/**
	 * 审核原因
	 */
	private String auditDesc;

	/**
	 * 审核时间
	 */
	private Timestamp auditTime;

	/**
	 * 用户名
	 */

	private String userName;
	/**
	 * 企业名
	 */

	private String companyName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getCtType() {
		return ctType;
	}

	public void setCtType(String ctType) {
		this.ctType = ctType;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getOperId() {
		return operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getAuditDesc() {
		return auditDesc;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

	public Timestamp getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Timestamp auditTime) {
		this.auditTime = auditTime;
	}

}
