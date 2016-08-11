package com.ai.ch.user.api.score.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

/**
 * 查询评分记录结果集
 * Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryScoreLogResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;
	private PageInfo<CtScoreLogVo> pageInfo;

	public PageInfo<CtScoreLogVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<CtScoreLogVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
