package com.ai.ch.user.api.defaultlog.params;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

/**
 * 查询扣款日志信息
 * Date: 2016年11月8日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryFullDefaultLogResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;
	private PageInfo<DefaultLogVo> pageInfo;

	public PageInfo<DefaultLogVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<DefaultLogVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}