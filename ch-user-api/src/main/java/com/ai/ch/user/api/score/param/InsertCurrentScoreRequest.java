package com.ai.ch.user.api.score.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 保存当前评分入参
 * Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class InsertCurrentScoreRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * 评分人
	 */
	private Long operId;

	/**
	 * 供货商ID
	 */
	private String userId;

	/**
	 * 总分
	 */
	private Integer totalScore;

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

}
