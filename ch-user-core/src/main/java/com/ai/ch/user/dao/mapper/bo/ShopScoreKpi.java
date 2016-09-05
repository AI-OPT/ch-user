package com.ai.ch.user.dao.mapper.bo;

import java.math.BigDecimal;

public class ShopScoreKpi {
    private Integer kpiId;

    private String kpiName;

    private String kpiDesc;

    private String tenantId;

    private Integer status;

    private BigDecimal weight;

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
        this.kpiName = kpiName == null ? null : kpiName.trim();
    }

    public String getKpiDesc() {
        return kpiDesc;
    }

    public void setKpiDesc(String kpiDesc) {
        this.kpiDesc = kpiDesc == null ? null : kpiDesc.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
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