package com.ai.ch.user.api.defaultlog.params;

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
