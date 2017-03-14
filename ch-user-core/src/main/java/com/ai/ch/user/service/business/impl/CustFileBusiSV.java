package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.custfile.params.CmCustFileExtVo;
import com.ai.ch.user.api.custfile.params.InsertCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtResponse;
import com.ai.ch.user.api.custfile.params.UpdateCustFileExtRequest;
import com.ai.ch.user.constants.SequenceCodeConstants.UserSequenceCode;
import com.ai.ch.user.dao.mapper.bo.CmCustFileExt;
import com.ai.ch.user.dao.mapper.bo.CmCustFileExtCriteria;
import com.ai.ch.user.service.atom.interfaces.ICustFileAtomSV;
import com.ai.ch.user.service.business.interfaces.ICustFileBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.CollectionUtil;

@Component
@Transactional
public class CustFileBusiSV implements ICustFileBusiSV {

	@Autowired
	private ICustFileAtomSV custFileAtomSV;
	
	@Override
	public int insertCustFileExt(InsertCustFileExtRequest request) throws SystemException, BusinessException {
		if(!CollectionUtil.isEmpty(request.getList())){
			for(CmCustFileExtVo cmCustFileExtVo : request.getList()){
				CmCustFileExt cmCustFileExt = new CmCustFileExt();
				BeanUtils.copyProperties(cmCustFileExtVo, cmCustFileExt);
				cmCustFileExt.setInfoExtId(SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18));
				custFileAtomSV.insert(cmCustFileExt);
			}
		}
		return 0;
	}

	@Override
	public QueryCustFileExtResponse QueryCustFileExt(QueryCustFileExtRequest request)
			throws SystemException, BusinessException {
		CmCustFileExtCriteria example = new CmCustFileExtCriteria();
		CmCustFileExtCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		if(null==request.getUsreId()){
			criteria.andUserIdIsNull();
		}else{
			criteria.andUserIdEqualTo(request.getUsreId());
		}
		if(request.getInfoType()!=null&&!"".equals(request.getInfoType())){
			criteria.andInfoTypeEqualTo(request.getInfoType());
		}
		List<CmCustFileExt> list = custFileAtomSV.selectByExample(example);
		List<CmCustFileExtVo> responseList = new ArrayList<CmCustFileExtVo>();
		for (CmCustFileExt cmCustFileExt : list) {
			CmCustFileExtVo cmCustFileExtVo = new CmCustFileExtVo();
			BeanUtils.copyProperties(cmCustFileExt, cmCustFileExtVo);
			responseList.add(cmCustFileExtVo);
		}
		QueryCustFileExtResponse response = new QueryCustFileExtResponse();
		response.setList(responseList);
		return response;
	}

	@Override
	public int updateCustFileExt(UpdateCustFileExtRequest request) throws SystemException, BusinessException {
		if(!CollectionUtil.isEmpty(request.getList())){
			for(CmCustFileExtVo cmCustFileExtVo : request.getList()){
				CmCustFileExtCriteria example = new CmCustFileExtCriteria();
				CmCustFileExtCriteria.Criteria criteria = example.createCriteria();
				criteria.andTenantIdEqualTo(request.getTenantId());
				criteria.andUserIdIsNull();
				criteria.andAttrIdEqualTo(cmCustFileExtVo.getAttrId());
				
				custFileAtomSV.deleteByExample(example);
				
				CmCustFileExt cmCustFileExt = new CmCustFileExt();
				BeanUtils.copyProperties(cmCustFileExtVo, cmCustFileExt);
				cmCustFileExt.setInfoExtId(SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18));
				custFileAtomSV.insert(cmCustFileExt);
			}
		}
		return 0;
	}

	@Override
	public int updateCustFileExtBycondition(UpdateCustFileExtRequest request) throws SystemException, BusinessException {
		
		if(!CollectionUtil.isEmpty(request.getList())){
			List<CmCustFileExtVo> list = request.getList();
			for(CmCustFileExtVo cmCustFileExtVo : list){
				CmCustFileExtCriteria example = new CmCustFileExtCriteria();
				CmCustFileExtCriteria.Criteria criteria = example.createCriteria();
				criteria.andTenantIdEqualTo(cmCustFileExtVo.getTenantId());
				if(cmCustFileExtVo.getUserId()!=null&&!"".equals(cmCustFileExtVo.getUserId())){
					criteria.andUserIdEqualTo(cmCustFileExtVo.getUserId());
				}											   
				if(cmCustFileExtVo.getInfoItem()!=null&&!"".equals(cmCustFileExtVo.getInfoItem())){
					criteria.andInfoItemEqualTo(cmCustFileExtVo.getInfoItem());
				}
				custFileAtomSV.deleteByExample(example);
				CmCustFileExt cmCustFileExt = new CmCustFileExt();
				BeanUtils.copyProperties(cmCustFileExtVo, cmCustFileExt);
				cmCustFileExt.setInfoExtId(SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18));
				custFileAtomSV.insert(cmCustFileExt);
			}
			
		}
		return 0;
	}

	@Override
	public int deleteCustFileExtBycondition(QueryCustFileExtRequest request)
			throws SystemException, BusinessException {
		CmCustFileExtCriteria example = new CmCustFileExtCriteria();
		CmCustFileExtCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andInfoExtIdEqualTo(request.getInfoExtId());
		return custFileAtomSV.deleteByExample(example);
	}
	
}
