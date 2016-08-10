package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;

public class CtCurrentScore extends CtCurrentScoreKey {
    private Timestamp scoreDate;

    private Integer totalScore;

    private String tenantId;

    public Timestamp getScoreDate() {
        return scoreDate;
    }

    public void setScoreDate(Timestamp scoreDate) {
        this.scoreDate = scoreDate;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }
}