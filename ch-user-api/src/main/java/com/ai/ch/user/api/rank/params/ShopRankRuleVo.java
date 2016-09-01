package com.ai.ch.user.api.rank.params;

/**
 * 店铺评级设置 Date: 2016年8月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class ShopRankRuleVo {

	/**
	 * 租户Id
	 */
	private String tenantId;

	/**
	 * 店铺等级
	 */
	private Integer rank;

	/**
	 * 评级周期类型
	 */
	private String periodType;

	/**
	 * 分数上限
	 */
	private Long minScore;

	/**
	 * 分数下限
	 */
	private Long maxScore;

	/**
	 * 等级名称
	 */
	private String rankName;

	/**
	 * 等级图
	 */
	private String rankLogo;

	/**
	 * 操作人
	 */
	private Long operId;

	/**
	 * 操作员姓名
	 */
	private String operName;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getPeriodType() {
		return periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public String getRankName() {
		return rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public String getRankLogo() {
		return rankLogo;
	}

	public void setRankLogo(String rankLogo) {
		this.rankLogo = rankLogo;
	}

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public Long getMinScore() {
		return minScore;
	}

	public void setMinScore(Long minScore) {
		this.minScore = minScore;
	}

	public Long getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Long maxScore) {
		this.maxScore = maxScore;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

}
