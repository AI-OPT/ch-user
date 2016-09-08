package com.ai.ch.user.api.shopinfo.params;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 批量查询店铺信息出参
 * Date: 2016年9月8日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopInfoBatchResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;
	private List<ShopInfoVo> list;

	public List<ShopInfoVo> getList() {
		return list;
	}

	public void setList(List<ShopInfoVo> list) {
		this.list = list;
	}

}
