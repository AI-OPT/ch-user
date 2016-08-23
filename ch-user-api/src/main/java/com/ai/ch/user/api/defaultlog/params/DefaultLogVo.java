package com.ai.ch.user.api.defaultlog.params;

import java.sql.Timestamp;

/**
 * 扣款记录表
 * Date: 2016年8月23日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class DefaultLogVo {

	/**
	 * 扣款日期
	 */
	private Timestamp deductDate;
	/**
	 * 扣款流水
	 */
	private String serialCode;

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

}
