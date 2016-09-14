package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 更新店铺信息入参
 * Date: 2016年8月23日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopInfoRequest extends BaseInfo{

	private static final long serialVersionUID = 1L;
	/**
	 * 用戶Id
	 */
	private String userId;
	
	/**
	 * 店铺名称
	 */
	private String shopName;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}