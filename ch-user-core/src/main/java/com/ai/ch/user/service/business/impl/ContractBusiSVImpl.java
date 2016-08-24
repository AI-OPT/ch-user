package com.ai.ch.user.service.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContactInfoResponse;
import com.ai.ch.user.dao.mapper.bo.CmCustFileExt;
import com.ai.ch.user.dao.mapper.bo.CtContractInfo;
import com.ai.ch.user.dao.mapper.bo.CtContractInfoCriteria;
import com.ai.ch.user.dao.mapper.bo.CtContractInfoCriteria.Criteria;
import com.ai.ch.user.service.atom.interfaces.IContractAtomSV;
import com.ai.ch.user.service.atom.interfaces.ICustFileAtomSV;
import com.ai.ch.user.service.business.interfaces.IContractBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;

@Component
@Transactional
public class ContractBusiSVImpl implements IContractBusiSV{
	
	@Autowired
	private IContractAtomSV contractAtomSV;
	
	@Autowired
    private ICustFileAtomSV custFileAtomSV;
    
	@Override
	public int insertContractInfo(ContactInfoRequest ctContractInfo)
			throws BusinessException, SystemException {
		CtContractInfo contractInfo = new CtContractInfo();
		BeanUtils.copyProperties(contractInfo, ctContractInfo);
		return contractAtomSV.insertContractInfo(contractInfo);
	}

	@Override
	public ContactInfoResponse queryContractInfo(ContactInfoRequest contactInfoRequest)
			throws BusinessException, SystemException {
		CtContractInfoCriteria example = new CtContractInfoCriteria();
		Criteria criteria = example.createCriteria();
		if(StringUtil.isBlank(contactInfoRequest.getTenantId())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
		}
		if(StringUtil.isBlank(contactInfoRequest.getUserId())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户ID不能为空");
		}
		if(StringUtil.isBlank(contactInfoRequest.getContractType())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:合同类型不能为空");
		}
		criteria.andTenantIdEqualTo(contactInfoRequest.getTenantId());
		criteria.andUserIdEqualTo(contactInfoRequest.getUserId());
		criteria.andContractTypeEqualTo(contactInfoRequest.getContractType());
		List<CtContractInfo> list = contractAtomSV.queryContractInfo(example);
		ContactInfoResponse response = new ContactInfoResponse();
		if(!CollectionUtil.isEmpty(list)){
			BeanUtils.copyProperties(response, list.get(0));
		}
		return response;
	}

}
