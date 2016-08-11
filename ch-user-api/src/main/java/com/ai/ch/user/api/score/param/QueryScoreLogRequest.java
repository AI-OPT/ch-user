package com.ai.ch.user.api.score.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 查询评分记录入参 Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryScoreLogRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;
	/**
	 * 供货商ID
	 */
	private String userId;

	/**
	 * 页码
	 */
	private int pageNo;

	/**
	 * 页数
	 */
	private int pageSize;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
