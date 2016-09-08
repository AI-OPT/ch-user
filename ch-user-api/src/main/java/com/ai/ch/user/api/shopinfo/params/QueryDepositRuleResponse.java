package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseResponse;

public class QueryDepositRuleResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	/**
	 * 商品品类Id
	 */
	private String productCatId;

	/**
	 * 默认保证金
	 */
	private Long defaultDeposit;

	public String getProductCatId() {
		return productCatId;
	}

	public void setProductCatId(String productCatId) {
		this.productCatId = productCatId;
	}

	public Long getDefaultDeposit() {
		return defaultDeposit;
	}

	public void setDefaultDeposit(Long defaultDeposit) {
		this.defaultDeposit = defaultDeposit;
	}

}
