package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 查询店铺保证金
 * Date: 2016年9月6日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopDepositRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
