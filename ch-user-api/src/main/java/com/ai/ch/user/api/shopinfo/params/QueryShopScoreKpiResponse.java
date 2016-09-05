package com.ai.ch.user.api.shopinfo.params;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 查询店铺评级系数 Date: 2016年9月5日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopScoreKpiResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private List<ShopScoreKpiVo> list;

	public List<ShopScoreKpiVo> getList() {
		return list;
	}

	public void setList(List<ShopScoreKpiVo> list) {
		this.list = list;
	}

}
