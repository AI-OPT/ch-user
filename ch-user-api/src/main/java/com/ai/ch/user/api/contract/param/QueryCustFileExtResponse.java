package com.ai.ch.user.api.contract.param;


import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class QueryCustFileExtResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;

    private List<CmCustFileExtVo> list;

    public List<CmCustFileExtVo> getList() {
        return list;
    }

    public void setList(List<CmCustFileExtVo> list) {
        this.list = list;
    }

}
