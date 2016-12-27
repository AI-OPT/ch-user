package com.ai.ch.user.api.custfile.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 查询附件信息请求参数
 * Date: 2016年12月27日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryCustFileExtRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	private String usreId;

	/**
	 * 附件类型
	 */
	private String infoType;
	
	/**
	 * 附件id
	 */
	private String infoExtId;
	
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

	public String getInfoExtId() {
		return infoExtId;
	}

	public void setInfoExtId(String infoExtId) {
		this.infoExtId = infoExtId;
	}

	
}
