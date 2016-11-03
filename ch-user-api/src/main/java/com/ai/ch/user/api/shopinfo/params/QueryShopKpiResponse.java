package com.ai.ch.user.api.shopinfo.params;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 查询店铺考核指标 Date: 2016年10月3日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopKpiResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private List<ShopScoreKpiVo> shopKpiList;

	public List<ShopScoreKpiVo> getShopKpiList() {
		return shopKpiList;
	}

	public void setShopKpiList(List<ShopScoreKpiVo> shopKpiList) {
		this.shopKpiList = shopKpiList;
	}

}
