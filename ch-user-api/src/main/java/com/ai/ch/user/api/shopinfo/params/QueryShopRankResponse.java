package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseResponse;

public class QueryShopRankResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private Integer rank;

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

}
