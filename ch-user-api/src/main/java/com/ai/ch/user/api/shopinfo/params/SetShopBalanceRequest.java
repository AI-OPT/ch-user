package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 设置结算设置入参 Date: 2016年10月26日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class SetShopBalanceRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	private String userId;

	/**
	 * 固定费周期
	 */
	private String rentCycleType;

	/**
	 * 固定费金额
	 */
	private Long rentFee;

	/**
	 * 订单划扣比例
	 */
	private Float ratio;

	/**
	 * 结算周期
	 */
	private String periodType;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRentCycleType() {
		return rentCycleType;
	}

	public void setRentCycleType(String rentCycleType) {
		this.rentCycleType = rentCycleType;
	}

	public Long getRentFee() {
		return rentFee;
	}

	public void setRentFee(Long rentFee) {
		this.rentFee = rentFee;
	}

	public Float getRatio() {
		return ratio;
	}

	public void setRatio(Float ratio) {
		this.ratio = ratio;
	}

	public String getPeriodType() {
		return periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

}
