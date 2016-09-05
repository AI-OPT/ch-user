package com.ai.ch.user.api.shopinfo.params;

import java.math.BigDecimal;

/**
 * 店铺评级指标
 * Date: 2016年9月5日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class ShopScoreKpiVo {

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
	 * 租户Id
	 */
	private String tenantId;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 权重系数
	 */
	private BigDecimal weight;

	/**
	 * 数据对象
	 */
	private Integer dataObject;

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

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public Integer getDataObject() {
		return dataObject;
	}

	public void setDataObject(Integer dataObject) {
		this.dataObject = dataObject;
	}

}
