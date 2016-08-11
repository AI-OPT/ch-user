package com.ai.ch.user.api.score.param;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 供应商综合评分查询结果 Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryCurrentScoreResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;
	/**
	 * 租户ID
	 */
	private String tenantId;
	/**
	 * 评分人
	 */
	private Long operId;

	/**
	 * 评分时间
	 */
	private Timestamp scoreDate;

	/**
	 * 供货商ID
	 */
	private String userId;

	/**
	 * 总分
	 */
	private Integer totalScore;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public Timestamp getScoreDate() {
		return scoreDate;
	}

	public void setScoreDate(Timestamp scoreDate) {
		this.scoreDate = scoreDate;
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
