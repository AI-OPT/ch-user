package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 查询店铺日志信息入参
 * Date: 2016年9月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopInfoLogRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;
	/**
	 * 店铺userId
	 */
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
