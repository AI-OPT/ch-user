package com.ai.ch.user.api.defaultlog.params;


import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 扣款记录入参
 * Date: 2016年8月23日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class InsertDefaultLogRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户Id
	 */
	private String userId;

	/**
	 * 扣款原因
	 */
	private String defaultReason;

	/**
	 * 扣款金额
	 */
	private Long deductBalance;

	/**
	 * 操作员
	 */
	private Long operId;
	/**
	 * 扣款时间
	 */
	private Timestamp deductDate;
	/**
	 * 操作流水号
	 */
	private String serialCode;

	/**
	 * 操作人
	 */
	private String operName;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDefaultReason() {
		return defaultReason;
	}

	public void setDefaultReason(String defaultReason) {
		this.defaultReason = defaultReason;
	}

	public Long getDeductBalance() {
		return deductBalance;
	}

	public void setDeductBalance(Long deductBalance) {
		this.deductBalance = deductBalance;
	}

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public Timestamp getDeductDate() {
		return deductDate;
	}

	public void setDeductDate(Timestamp deductDate) {
		this.deductDate = deductDate;
	}

	public String getSerialCode() {
		return serialCode;
	}

	public void setSerialCode(String serialCode) {
		this.serialCode = serialCode;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}
}
