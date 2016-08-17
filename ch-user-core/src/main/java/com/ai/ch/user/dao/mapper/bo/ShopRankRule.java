package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;

public class ShopRankRule {
    private Integer rank;

    private String periodType;

    private Long minFee;

    private Long maxFee;

    private String rankName;

    private String rankLogo;

    private String tenantId;

    private Timestamp updateTime;

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
        this.periodType = periodType == null ? null : periodType.trim();
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
        this.rankName = rankName == null ? null : rankName.trim();
    }

    public String getRankLogo() {
        return rankLogo;
    }

    public void setRankLogo(String rankLogo) {
        this.rankLogo = rankLogo == null ? null : rankLogo.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }
}