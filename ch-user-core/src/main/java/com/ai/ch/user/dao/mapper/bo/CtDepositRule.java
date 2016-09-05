package com.ai.ch.user.dao.mapper.bo;

public class CtDepositRule {
    private String productCatId;

    private Long defaultDeposit;

    public String getProductCatId() {
        return productCatId;
    }

    public void setProductCatId(String productCatId) {
        this.productCatId = productCatId == null ? null : productCatId.trim();
    }

    public Long getDefaultDeposit() {
        return defaultDeposit;
    }

    public void setDefaultDeposit(Long defaultDeposit) {
        this.defaultDeposit = defaultDeposit;
    }
}