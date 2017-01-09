package com.ai.ch.user.api.audit.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 审核记录 Date: 2016年12月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class InsertAuditInfoRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	private String userId;

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
	 * 用户名
	 */

	private String userName;
	/**
	 * 企业名
	 */

	private String companyName;

	/**
	 * 审核原因
	 */
	private String auditDesc;

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

}
