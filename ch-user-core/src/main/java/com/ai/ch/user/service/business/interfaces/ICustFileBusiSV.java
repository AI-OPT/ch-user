package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.custfile.params.InsertCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtResponse;
import com.ai.ch.user.api.custfile.params.UpdateCustFileExtRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface ICustFileBusiSV {

	    public int insertCustFileExt(InsertCustFileExtRequest request)
	            throws SystemException, BusinessException;

	    QueryCustFileExtResponse QueryCustFileExt(QueryCustFileExtRequest request)
	            throws SystemException, BusinessException;

	    public int updateCustFileExt(UpdateCustFileExtRequest request)
	            throws SystemException, BusinessException;
	    
}