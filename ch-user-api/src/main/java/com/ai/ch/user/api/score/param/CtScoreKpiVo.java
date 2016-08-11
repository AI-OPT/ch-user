package com.ai.ch.user.api.score.param;

/**
 * 评分Kpi
 * Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class CtScoreKpiVo {

	/**
	 * KPI标识
	 */
	private Integer kpiId;

	/**
	 * 指标名称
	 */
	private String kpiName;

	/**
	 * 指标描述
	 */
	private String kpiDesc;

	/**
	 * 最低分
	 */
	private Integer minScore;

	/**
	 * 最高分
	 */
	private Integer maxScore;

	/**
	 * 租户ID
	 */
	private String tenantId;

	/**
	 * 状态
	 */
	private Integer status;

	public Integer getKpiId() {
		return kpiId;
	}

	public void setKpiId(Integer kpiId) {
		this.kpiId = kpiId;
	}

	public String getKpiName() {
		return kpiName;
	}

	public void setKpiName(String kpiName) {
		this.kpiName = kpiName;
	}

	public String getKpiDesc() {
		return kpiDesc;
	}

	public void setKpiDesc(String kpiDesc) {
		this.kpiDesc = kpiDesc;
	}

	public Integer getMinScore() {
		return minScore;
	}

	public void setMinScore(Integer minScore) {
		this.minScore = minScore;
	}

	public Integer getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Integer maxScore) {
		this.maxScore = maxScore;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
