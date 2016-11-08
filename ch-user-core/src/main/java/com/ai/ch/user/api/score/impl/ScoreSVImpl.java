package com.ai.ch.user.api.score.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.score.interfaces.IScoreSV;
import com.ai.ch.user.api.score.param.CountScoreAvgRequest;
import com.ai.ch.user.api.score.param.CountScoreAvgResponse;
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
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场查询评分规则信息服务开始"+beginTime);
			response = currentScoreBusiSV.queryCurrentScore(request);
			LOG.info("后场查询评分信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
			responseHeader = new ResponseHeader(true, ChUserConstants.SupplierScore.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("查询失败", e);
			responseHeader = new ResponseHeader(false, ChUserConstants.SupplierScore.Fail, "操作失败");
		}
		if (response.getUserId() == null){
			responseHeader.setResultCode(ChUserConstants.SupplierScore.NOTFOUND);
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse insertScoreLog(InsertScoreLogRequest request) throws BusinessException, SystemException {

		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = null;
		try {
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场保存评分规则信息服务开始"+beginTime);
			scoreLogBusiSV.insertScoreLog(request);
			LOG.info("后场保存评分信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
		QueryScoreKpiResponse response = new QueryScoreKpiResponse();
		ResponseHeader responseHeader = null;
		try {
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场查询评分规则信息服务开始"+beginTime);
			response = scoreKpiBusiSV.queryScoreKpi(request);
			LOG.info("后场查询评分信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
		ResponseHeader responseHeader = null;
		try {
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场查询评分信息服务开始"+beginTime);
			currentScoreBusiSV.insertCurrentScore(request);
			LOG.info("后场查询评分服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
		ResponseHeader responseHeader = null;
		try {
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场更新评分规则信息服务开始"+beginTime);
			currentScoreBusiSV.updateCurrentScore(request);
			LOG.info("后场更新评分信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
		QueryScoreLogResponse response = new QueryScoreLogResponse();
		ResponseHeader responseHeader = null;
		try {
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场查询评分记录信息服务开始"+beginTime);
			response = scoreLogBusiSV.queryScoreLog(request);
			LOG.info("后场查询评分记录服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
			responseHeader = new ResponseHeader(true, ChUserConstants.SupplierScore.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("添加失败", e);
			responseHeader = new ResponseHeader(false, ChUserConstants.SupplierScore.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return scoreLogBusiSV.queryScoreLog(request);
	}

	@Override
	public CountScoreAvgResponse countScoreAvg(CountScoreAvgRequest request) throws BusinessException, SystemException {
		CountScoreAvgResponse response = new CountScoreAvgResponse();
		ResponseHeader responseHeader =null;
		try{
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场查询评分信息服务开始"+beginTime);
			float scoreAvg = scoreLogBusiSV.countScoreAvg(request);
			LOG.info("后场查询评分信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
			response.setScoreAvg(scoreAvg);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}
}
