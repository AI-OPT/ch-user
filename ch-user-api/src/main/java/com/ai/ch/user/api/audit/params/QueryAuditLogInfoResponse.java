package com.ai.ch.user.api.audit.params;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

/**
 * 审核记录日志查询结果
 * Date: 2016年12月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryAuditLogInfoResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private PageInfo<AuditLogVo> pageInfo;

	public PageInfo<AuditLogVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<AuditLogVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
