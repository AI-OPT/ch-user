package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 设置店铺保证金入参
 * Date: 2016年10月26日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class SetShopDepositRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	private String userId;

	private Long depositBalance;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getDepositBalance() {
		return depositBalance;
	}

	public void setDepositBalance(Long depositBalance) {
		this.depositBalance = depositBalance;
	}

}
