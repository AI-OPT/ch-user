package com.ai.ch.user.service.business.interfaces;


import java.util.List;

import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContractInfoResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IContractBusiSV {
	public int insertContractInfo(ContactInfoRequest  ctContractInfo)throws BusinessException, SystemException;
	public ContractInfoResponse queryContractInfo(ContactInfoRequest contactInfoRequest)throws BusinessException, SystemException;
	public List<ContractInfoResponse> queryAllContractInfo(ContactInfoRequest contactInfoRequest)throws BusinessException, SystemException;
	
}
