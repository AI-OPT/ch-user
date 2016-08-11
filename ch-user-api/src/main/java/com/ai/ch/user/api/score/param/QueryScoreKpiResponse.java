package com.ai.ch.user.api.score.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 查询Kpi结果 Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryScoreKpiResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 评分Kpi列表
	 */
	private List<CtScoreKpiVo> list;

	public List<CtScoreKpiVo> getList() {
		return list;
	}

	public void setList(List<CtScoreKpiVo> list) {
		this.list = list;
	}

}
