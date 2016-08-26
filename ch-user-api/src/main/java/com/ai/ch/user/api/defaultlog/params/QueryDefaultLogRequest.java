package com.ai.ch.user.api.defaultlog.params;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 查询扣款记录入参 Date: 2016年8月23日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryDefaultLogRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;
	/**
	 * 用户Id
	 */
	private String userId;
	
	/**
	 * 用户名称
	 */
	private String  loginName;
	
	/**
	 * 企业名称
	 */
    private String custName;
    
	private Integer pageNo;

	private Integer pageSize;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
