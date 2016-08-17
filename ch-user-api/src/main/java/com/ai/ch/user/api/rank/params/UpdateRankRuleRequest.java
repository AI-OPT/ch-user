package com.ai.ch.user.api.rank.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 更新店铺等级入参 Date: 2016年8月17日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UpdateRankRuleRequest extends BaseInfo{

	private static final long serialVersionUID = 1L;

	/**
	 * 店铺等级
	 */
	private Integer rank;

	/**
	 * 评级周期类型
	 */
	private String periodType;

	/**
	 * 服务费下限
	 */
	private Long minFee;

	/**
	 * 服务费上限
	 */
	private Long maxFee;

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

	public Long getMinFee() {
		return minFee;
	}

	public void setMinFee(Long minFee) {
		this.minFee = minFee;
	}

	public Long getMaxFee() {
		return maxFee;
	}

	public void setMaxFee(Long maxFee) {
		this.maxFee = maxFee;
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

}
