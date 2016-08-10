package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;

public class CtScoreLogKey {
    private Long operId;

    private Timestamp scoreDate;

    private String userId;

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public Timestamp getScoreDate() {
        return scoreDate;
    }

    public void setScoreDate(Timestamp scoreDate) {
        this.scoreDate = scoreDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}