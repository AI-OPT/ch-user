package com.ai.ch.user.api.shopinfo.params;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 店铺信息日志表
 * Date: 2016年9月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class ShopInfoLogVo implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 租户Id
	 */
	private String tenantId;

	/**
	 * 更新时间
	 */
	private Timestamp updateTime;
	/**
	 * 用户Id
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
	 * 固定费金额
	 */
	private String rentCycleType;

	/**
	 * 固定费
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
	 * 有无电商平台
	 */
	private String ecommOwner;

	/**
	 * 操作员Id
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

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
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

	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

}
