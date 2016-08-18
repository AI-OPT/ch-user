package com.ai.ch.user.api.rank.params;

import java.util.List;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 更新店铺等级设置入参 Date: 2016年8月17日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UpdateRankRuleRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * 设置列表
	 */
	private List<ShopRankRuleVo> list;

	public List<ShopRankRuleVo> getList() {
		return list;
	}

	public void setList(List<ShopRankRuleVo> list) {
		this.list = list;
	}

}
