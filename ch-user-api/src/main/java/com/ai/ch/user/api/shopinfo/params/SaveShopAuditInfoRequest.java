package com.ai.ch.user.api.shopinfo.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 保存商户资质信息
 * Date: 2016年9月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class SaveShopAuditInfoRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * 用戶Id
	 */
	private String userId;

	/**
	 * 店铺名称
	 */
	private String shopName;

	/**
	 * 店铺介绍
	 */
	private String shopDesc;

	/**
	 * 经营类型 1/2:生产厂商/品牌代理商
	 */
	private String busiType;

	/**
	 * 可售商品数量
	 */
	private Integer goodsNum;

	/**
	 * 有无电商经验 0/1:无/有
	 */
	private Integer hasExperi;

	/**
	 * 现有电商平台 按京东/天猫/淘宝/苏宁/一号店/自有电商平台存6位01串数字
	 */
	private String ecommOwner;

	/**
	 * 商户编号
	 */
	private String merchantNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
