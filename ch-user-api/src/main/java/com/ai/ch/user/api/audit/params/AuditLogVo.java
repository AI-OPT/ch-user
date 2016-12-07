package com.ai.ch.user.api.audit.params;

import java.io.Serializable;
import java.sql.Timestamp;

public class AuditLogVo implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 日志id
	 */
	private String logId;

	/**
	 * 类型
	 */
	private String ctType;

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
	 * 审核时间
	 */
	private Timestamp auditTime;

	/**
	 * 操作员id
	 */
	private String operId;

	/**
	 * 操作员姓名
	 */
	private String operName;

	/**
	 * 审核描述
	 */
	private String auditDesc;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getCtType() {
		return ctType;
	}

	public void setCtType(String ctType) {
		this.ctType = ctType;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
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

	public Timestamp getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Timestamp auditTime) {
		this.auditTime = auditTime;
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

}
