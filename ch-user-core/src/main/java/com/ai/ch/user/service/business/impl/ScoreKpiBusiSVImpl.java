package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.score.param.CtScoreKpiVo;
import com.ai.ch.user.api.score.param.QueryScoreKpiRequest;
import com.ai.ch.user.api.score.param.QueryScoreKpiResponse;
import com.ai.ch.user.dao.mapper.bo.CtScoreKpi;
import com.ai.ch.user.dao.mapper.bo.CtScoreKpiCriteria;
import com.ai.ch.user.service.atom.interfaces.IScoreKpiAtomSV;
import com.ai.ch.user.service.business.interfaces.IScoreKpiBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class ScoreKpiBusiSVImpl implements IScoreKpiBusiSV{

	@Autowired
	private IScoreKpiAtomSV scoreKpiAtomSV;
	
	@Override
	public QueryScoreKpiResponse queryScoreKpi(QueryScoreKpiRequest request) throws BusinessException, SystemException {
		QueryScoreKpiResponse response = new QueryScoreKpiResponse();
		CtScoreKpiCriteria example = new CtScoreKpiCriteria();
		CtScoreKpiCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		List<CtScoreKpi> list = scoreKpiAtomSV.selectByExample(example);
		List<CtScoreKpiVo> responseList = new ArrayList<CtScoreKpiVo>();
		for (CtScoreKpi ctScoreKpi : list) {
			CtScoreKpiVo ctScoreKpiVo = new CtScoreKpiVo();
			BeanUtils.copyProperties(ctScoreKpi, ctScoreKpiVo);
			responseList.add(ctScoreKpiVo);
		}
		response.setList(responseList);
		return response;
	}

}
