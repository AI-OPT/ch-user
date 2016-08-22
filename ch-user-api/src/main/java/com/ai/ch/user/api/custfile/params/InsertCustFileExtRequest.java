package com.ai.ch.user.api.custfile.params;

import java.io.Serializable;
import java.util.List;

public class InsertCustFileExtRequest implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private List<CmCustFileExtVo> list;

    public List<CmCustFileExtVo> getList() {
        return list;
    }

    public void setList(List<CmCustFileExtVo> list) {
        this.list = list;
    }

}
