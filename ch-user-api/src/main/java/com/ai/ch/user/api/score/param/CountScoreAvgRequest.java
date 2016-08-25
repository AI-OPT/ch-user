package com.ai.ch.user.api.score.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 特定供货商平均分入参
 * Date: 2016年8月24日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class CountScoreAvgRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * userId
	 */
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
