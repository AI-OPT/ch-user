package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 查询保证金出参 Date: 2016年10月26日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopDepositResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 应缴纳保证金
	 */
	private long depositBalance;

	public long getDepositBalance() {
		return depositBalance;
	}

	public void setDepositBalance(long depositBalance) {
		this.depositBalance = depositBalance;
	}

}
