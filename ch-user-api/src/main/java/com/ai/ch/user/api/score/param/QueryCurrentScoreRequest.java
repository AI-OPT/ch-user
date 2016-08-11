package com.ai.ch.user.api.score.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 查询评分记录入参 Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryCurrentScoreRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;
	/**
	 * 供货商ID
	 */
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
