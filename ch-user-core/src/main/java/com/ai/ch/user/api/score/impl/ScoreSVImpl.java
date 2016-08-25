package com.ai.ch.user.api.score.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.score.interfaces.IScoreSV;
import com.ai.ch.user.api.score.param.CountScoreAvgRequest;
import com.ai.ch.user.api.score.param.InsertCurrentScoreRequest;
import com.ai.ch.user.api.score.param.InsertScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreResponse;
import com.ai.ch.user.api.score.param.QueryScoreKpiRequest;
import com.ai.ch.user.api.score.param.QueryScoreKpiResponse;
import com.ai.ch.user.api.score.param.QueryScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogResponse;
import com.ai.ch.user.api.score.param.UpdateCurrentScoreRequest;
import com.ai.ch.user.constants.ChUserConstants;
import com.ai.ch.user.service.business.interfaces.ICurrentScoreBusiSV;
import com.ai.ch.user.service.business.interfaces.IScoreKpiBusiSV;
import com.ai.ch.user.service.business.interfaces.IScoreLogBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class ScoreSVImpl implements IScoreSV {

	static final Log LOG = LogFactory.getLog(ScoreSVImpl.class);

	@Autowired
	private ICurrentScoreBusiSV currentScoreBusiSV;
	@Autowired
	private IScoreLogBusiSV scoreLogBusiSV;
	@Autowired
	private IScoreKpiBusiSV scoreKpiBusiSV;

	@Override
	public QueryCurrentScoreResponse queryCurrentScore(QueryCurrentScoreRequest request)
			throws BusinessException, SystemException {
		QueryCurrentScoreResponse response = new QueryCurrentScoreResponse();
		ResponseHeader responseHeader = null;
		try {
			response = currentScoreBusiSV.queryCurrentScore(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.SupplierScore.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("查询失败", e);
			responseHeader = new ResponseHeader(false, ChUserConstants.SupplierScore.Fail, "操作失败");
		}
		if (response.getUserId() == null)
			responseHeader.setResultCode(ChUserConstants.SupplierScore.NOTFOUND);
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse insertScoreLog(InsertScoreLogRequest request) throws BusinessException, SystemException {

		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			scoreLogBusiSV.insertScoreLog(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.SupplierScore.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("添加失败", e);
			responseHeader = new ResponseHeader(false, ChUserConstants.SupplierScore.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryScoreKpiResponse queryScoreKpi(QueryScoreKpiRequest request) throws BusinessException, SystemException {
		QueryScoreKpiResponse response = null;
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			response = scoreKpiBusiSV.queryScoreKpi(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.SupplierScore.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("查询失败");
			responseHeader = new ResponseHeader(false, ChUserConstants.SupplierScore.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse insertCurrentScore(InsertCurrentScoreRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			currentScoreBusiSV.insertCurrentScore(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.SupplierScore.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("添加失败", e);
			responseHeader = new ResponseHeader(false, ChUserConstants.SupplierScore.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse updateCurrentScore(UpdateCurrentScoreRequest request)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			currentScoreBusiSV.updateCurrentScore(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.SupplierScore.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("添加失败", e);
			responseHeader = new ResponseHeader(false, ChUserConstants.SupplierScore.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryScoreLogResponse queryScoreLog(QueryScoreLogRequest request) throws BusinessException, SystemException {
		QueryScoreLogResponse response = null;
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			response = scoreLogBusiSV.queryScoreLog(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.SupplierScore.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("添加失败", e);
			responseHeader = new ResponseHeader(false, ChUserConstants.SupplierScore.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return scoreLogBusiSV.queryScoreLog(request);
	}

	@Override
	public float countScoreAvg(CountScoreAvgRequest request) throws BusinessException, SystemException {
		return scoreLogBusiSV.countScoreAvg(request);
	}

}
