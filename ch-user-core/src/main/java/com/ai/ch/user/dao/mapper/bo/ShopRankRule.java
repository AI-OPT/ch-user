package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;

public class ShopRankRule {
    private Integer rank;

    private String periodType;

    private Long minScore;

    private Long maxScore;

    private String rankName;

    private String rankLogo;

    private String tenantId;

    private Timestamp updateTime;

    private Long operId;

    private String operName;

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

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }
}