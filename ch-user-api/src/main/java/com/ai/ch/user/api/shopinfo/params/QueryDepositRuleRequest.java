package com.ai.ch.user.api.shopinfo.params;

import java.io.Serializable;

/**
 * 获取默认保证金入参
 * Date: 2016年9月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryDepositRuleRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 商品品类Id
	 */
	 private String productCatId;

	public String getProductCatId() {
		return productCatId;
	}

	public void setProductCatId(String productCatId) {
		this.productCatId = productCatId;
	}
	 
	 
}
