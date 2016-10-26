package com.ai.ch.user.api.score.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 供货商综合查分出参
 * Date: 2016年10月26日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class CountScoreAvgResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private float scoreAvg;

	public float getScoreAvg() {
		return scoreAvg;
	}

	public void setScoreAvg(float scoreAvg) {
		this.scoreAvg = scoreAvg;
	}

}
