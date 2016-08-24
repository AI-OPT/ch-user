package com.ai.ch.user.api.contract.param;


import com.ai.opt.base.vo.BaseInfo;

public class QueryCustFileExtRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
