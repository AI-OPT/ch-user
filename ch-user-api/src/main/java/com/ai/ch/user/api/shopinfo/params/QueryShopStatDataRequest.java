package com.ai.ch.user.api.shopinfo.params;

import java.io.Serializable;

/**
 * 查询店铺评级统计数据
 * Date: 2016年9月5日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopStatDataRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
