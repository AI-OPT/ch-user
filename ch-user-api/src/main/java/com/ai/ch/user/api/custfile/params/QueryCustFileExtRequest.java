package com.ai.ch.user.api.custfile.params;

import com.ai.opt.base.vo.BaseInfo;

public class QueryCustFileExtRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	private String usreId;

	private String infoType;
	
	public String getUsreId() {
		return usreId;
	}

	public void setUsreId(String usreId) {
		this.usreId = usreId;
	}

	public String getInfoType() {
		return infoType;
	}

	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	
}
