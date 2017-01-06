package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.custfile.params.InsertCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtResponse;
import com.ai.ch.user.api.custfile.params.UpdateCustFileExtRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface ICustFileBusiSV {

	/**
	 * 保存附件表信息
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 */
	    public int insertCustFileExt(InsertCustFileExtRequest request)
	            throws SystemException, BusinessException;

	    /**
	     * 查询附件表信息
	     * @param request
	     * @return
	     * @throws SystemException
	     * @throws BusinessException
	     */
	    QueryCustFileExtResponse QueryCustFileExt(QueryCustFileExtRequest request)
	            throws SystemException, BusinessException;

	    /**
	     * 更新附件表信息
	     * @param request
	     * @return
	     * @throws SystemException
	     * @throws BusinessException
	     */
	    public int updateCustFileExt(UpdateCustFileExtRequest request)
	            throws SystemException, BusinessException;
	    /**
	     * 更新附件表信息
	     * @param request
	     * @return
	     * @throws SystemException
	     * @throws BusinessException
	     */
	    public int updateCustFileExtBycondition(UpdateCustFileExtRequest request) 
	    		throws SystemException, BusinessException;
	    /**
	     * 删除附件表信息
	     * @param request
	     * @return
	     * @throws SystemException
	     * @throws BusinessException
	     */
	    public int deleteCustFileExtBycondition(QueryCustFileExtRequest request) 
	    		throws SystemException, BusinessException;
}