package com.ai.ch.user.api.shopinfo.params;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 查询店铺信息 Date: 2016年8月23日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopInfoResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;
	/**
	 * tenantId
	 */
	private String tenantId;
	/**
	 * 时间
	 */
	private Timestamp createTime;
	/**
	 * 用戶Id
	 */
	private String userId;

	/**
	 * 应缴保证金
	 */
	private Long depositBalance;

	/**
	 * 结算周期
	 */
	private String periodType;

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
	private Integer ratio;

	/**
	 * 店铺等级
	 */
	private Integer rank;

	/**
	 * 等级图
	 */
	private String rankLogo;

	/**
	 * 店铺名称
	 */
	private String shopName;

	/**
	 * 店铺介绍
	 */
	private String shopDesc;

	/**
	 * 经营类型
	 */
	private String busiType;

	/**
	 * 可售商品数量
	 */
	private Integer goodsNum;

	/**
	 * 有无电商经验
	 */
	private Integer hasExperi;

	/**
	 * 现有电商平台
	 */
	private String ecommOwner;

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getDepositBalance() {
		return depositBalance;
	}

	public void setDepositBalance(Long depositBalance) {
		this.depositBalance = depositBalance;
	}

	public String getPeriodType() {
		return periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
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

	public Integer getRatio() {
		return ratio;
	}

	public void setRatio(Integer ratio) {
		this.ratio = ratio;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getRankLogo() {
		return rankLogo;
	}

	public void setRankLogo(String rankLogo) {
		this.rankLogo = rankLogo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopDesc() {
		return shopDesc;
	}

	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Integer getHasExperi() {
		return hasExperi;
	}

	public void setHasExperi(Integer hasExperi) {
		this.hasExperi = hasExperi;
	}

	public String getEcommOwner() {
		return ecommOwner;
	}

	public void setEcommOwner(String ecommOwner) {
		this.ecommOwner = ecommOwner;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
