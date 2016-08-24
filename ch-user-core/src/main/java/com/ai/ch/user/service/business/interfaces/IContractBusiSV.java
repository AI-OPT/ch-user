package com.ai.ch.user.service.business.interfaces;


import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContactInfoResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IContractBusiSV {
	public int insertContractInfo(ContactInfoRequest  ctContractInfo)throws BusinessException, SystemException;
	public ContactInfoResponse queryContractInfo(ContactInfoRequest contactInfoRequest)throws BusinessException, SystemException;
}
