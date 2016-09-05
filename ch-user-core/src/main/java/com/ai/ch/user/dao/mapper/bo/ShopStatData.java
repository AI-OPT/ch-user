package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;

public class ShopStatData {
    private String userId;

    private String userName;

    private Long orderAmount;

    private Long orderCount;

    private Long servCharge;

    private Timestamp genTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    public Long getServCharge() {
        return servCharge;
    }

    public void setServCharge(Long servCharge) {
        this.servCharge = servCharge;
    }

    public Timestamp getGenTime() {
        return genTime;
    }

    public void setGenTime(Timestamp genTime) {
        this.genTime = genTime;
    }
}