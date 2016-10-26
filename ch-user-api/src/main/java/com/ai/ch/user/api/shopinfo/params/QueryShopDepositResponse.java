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

	private long deposit;

	public long getDeposit() {
		return deposit;
	}

	public void setDeposit(long deposit) {
		this.deposit = deposit;
	}

}
