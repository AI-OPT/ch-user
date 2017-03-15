package com.ai.ch.user.service.business.interfaces;

import java.math.BigDecimal;
import java.util.List;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.InsertShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoByIdRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataResponse;
import com.ai.ch.user.api.shopinfo.params.SaveShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.SetShopBalanceRequest;
import com.ai.ch.user.api.shopinfo.params.SetShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatusRequest;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpi;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IShopInfoBusiSV {

	/**
	 * 查询店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request) throws BusinessException, SystemException;

	/**
	 * 保存店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public int insertShopInfo(InsertShopInfoRequst request) throws BusinessException, SystemException;

	/**
	 * 更新店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void updateShopInfo(UpdateShopInfoRequest request,ShopInfo shopInfo) throws BusinessException, SystemException;

	/**
	 * 查询保证金设置
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryDepositRuleResponse queryDepositRule(QueryDepositRuleRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 查询评分kpi
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public List<ShopScoreKpi> queryShopScoreKpi(QueryShopScoreKpiRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 更新店铺关联信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void updateShopStatData(UpdateShopStatDataRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 保存店铺关联信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void insertShopStatData(InsertShopStatDataRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 查询店铺关联信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryShopStatDataResponse queryShopStatData(QueryShopStatDataRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 查询店铺等级
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Integer queryShopRank(QueryShopRankRequest request,BigDecimal score) throws BusinessException, SystemException;
	
	/**
	 * 查询店铺保证金设置
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public Long queryShopDeposit(QueryShopDepositRequest request) throws BusinessException, SystemException;
	
	/**
	 * 批量查询店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public List<ShopInfo> queryShopInfoBatch(QueryShopInfoBatchRequest request)
			throws BusinessException, SystemException;
	/**
	 * 校验店铺唯一性
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public List<ShopInfo> checkShopNameOnly(QueryShopInfoRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 保存资质信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void saveShopAuditInfo(SaveShopAuditInfoRequest request) throws BusinessException, SystemException ;
	
	/**
	 * 更新店铺状态
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void updateShopStatus(UpdateShopStatusRequest request,ShopInfo shopInfo) throws BusinessException, SystemException;
	
	/**
	 * 根据id查询店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryShopInfoResponse queryShopInfoById(QueryShopInfoByIdRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 设置保证金
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void setShopDeposit(SetShopDepositRequest request) throws BusinessException, SystemException;
	
	/**
	 * 设置固定费
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void setShopBalance(SetShopBalanceRequest request) throws BusinessException, SystemException ;
	
	/**
	 * 查询店铺kpi
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public List<ShopScoreKpi> queryShopKpi(QueryShopKpiRequest request) throws BusinessException, SystemException;
	
	/**
	 * 更新资质信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void updateShopAuditInfo(UpdateShopAuditInfoRequest request)
			throws BusinessException, SystemException;
}
