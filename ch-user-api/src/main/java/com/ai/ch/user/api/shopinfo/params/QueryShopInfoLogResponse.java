package com.ai.ch.user.api.shopinfo.params;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 查询店铺信息日志集合 Date: 2016年9月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopInfoLogResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private List<ShopInfoLogVo> list;

	public List<ShopInfoLogVo> getList() {
		return list;
	}

	public void setList(List<ShopInfoLogVo> list) {
		this.list = list;
	}

}
