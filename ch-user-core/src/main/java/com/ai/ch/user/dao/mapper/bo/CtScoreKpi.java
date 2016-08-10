package com.ai.ch.user.dao.mapper.bo;

public class CtScoreKpi {
    private Integer kpiId;

    private String kpiName;

    private String kpiDesc;

    private Integer minScore;

    private Integer maxScore;

    private String tenantId;

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
        this.kpiName = kpiName == null ? null : kpiName.trim();
    }

    public String getKpiDesc() {
        return kpiDesc;
    }

    public void setKpiDesc(String kpiDesc) {
        this.kpiDesc = kpiDesc == null ? null : kpiDesc.trim();
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
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}