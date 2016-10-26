package com.ai.ch.user.api.rank.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.rank.interfaces.IRankSV;
import com.ai.ch.user.api.rank.params.InsertRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleResponse;
import com.ai.ch.user.api.rank.params.UpdateRankRuleRequest;
import com.ai.ch.user.constants.ChUserConstants;
import com.ai.ch.user.service.business.interfaces.IShopRankRuleBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class RankSVImpl implements IRankSV {

	private static final Log LOG = LogFactory.getLog(RankSVImpl.class);
	
	@Autowired
	private IShopRankRuleBusiSV shopRankRuleBusiSV;

	@Override
	public BaseResponse insertRankRule(InsertRankRuleRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场保存规则信息服务开始"+beginTime);
			shopRankRuleBusiSV.insertRankRule(request);
			LOG.info("后场保存规则信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse updateRankRule(UpdateRankRuleRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场更新规则信息服务开始"+beginTime);
			shopRankRuleBusiSV.updateRankRule(request);
			LOG.info("后场更新规则信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryRankRuleResponse queryRankRule(QueryRankRuleRequest request) throws BusinessException, SystemException {
		QueryRankRuleResponse response = new QueryRankRuleResponse();
		ResponseHeader responseHeader =null;
		try{
			Long beginTime = System.currentTimeMillis();
			LOG.info("后场查询规则信息服务开始"+beginTime);
			response = shopRankRuleBusiSV.queryRankRule(request);
			LOG.info("后场查询规则信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

}
