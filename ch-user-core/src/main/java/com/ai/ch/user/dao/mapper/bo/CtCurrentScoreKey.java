package com.ai.ch.user.dao.mapper.bo;

public class CtCurrentScoreKey {
    private Long operId;

    private String userId;

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}