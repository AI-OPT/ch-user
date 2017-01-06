package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IDefaultLogBusiSV {

	/**
	 * 保存扣款日志
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 */
	public String insertDefaultLog(InsertDefaultLogRequest request) throws SystemException, BusinessException;
	
	/**
	 * 获取违约扣款日志
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 */
	public QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request)
			throws SystemException, BusinessException;
	
	/**
	 * 删除违约扣款日志
	 * @param serialCode
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 */
	public int deleteDefaultLog(String serialCode)throws SystemException, BusinessException;
	
	/**
	 * 查询全量扣款日志
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 */
	public QueryFullDefaultLogResponse queryFullDefaultLog(QueryFullDefaultLogRequest request)
			throws SystemException, BusinessException;
}
