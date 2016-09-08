package com.ai.ch.user.api.shopinfo.params;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 查询店铺信息入参 Date: 2016年9月8日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryShopInfoBatchRequest extends BaseInfo {

	private static final long serialVersionUID = 1L;

	private Timestamp beginTime;

	private Timestamp endTime;

	public Timestamp getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

}
