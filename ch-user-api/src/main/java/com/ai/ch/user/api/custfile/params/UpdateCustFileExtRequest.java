package com.ai.ch.user.api.custfile.params;

import java.util.ArrayList;
import java.util.List;

import com.ai.opt.base.vo.BaseInfo;

public class UpdateCustFileExtRequest extends BaseInfo{

    private static final long serialVersionUID = 1L;
    /**
     * 用户Id
     */
    private String userId;
    
    /**
     * 条目
     * 30001 供应商扫描合同
     * 30002 供应商电子合同
     * 40001 店铺扫描合同
     * 40002 店铺电子合同
     */
    private String infoItem;
    
    List<CmCustFileExtVo> list = new ArrayList<CmCustFileExtVo>();
    
    public List<CmCustFileExtVo> getList() {
        return list;
    }

    public void setList(List<CmCustFileExtVo> list) {
        this.list = list;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getInfoItem() {
		return infoItem;
	}

	public void setInfoItem(String infoItem) {
		this.infoItem = infoItem;
	}

}
