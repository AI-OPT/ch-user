package com.ai.ch.user.api.custfile.params;

import java.util.ArrayList;
import java.util.List;

import com.ai.opt.base.vo.BaseInfo;

public class UpdateCustFileExtRequest extends BaseInfo{

    private static final long serialVersionUID = 1L;
    List<CmCustFileExtVo> list = new ArrayList<CmCustFileExtVo>();

    public List<CmCustFileExtVo> getList() {
        return list;
    }

    public void setList(List<CmCustFileExtVo> list) {
        this.list = list;
    }

}
