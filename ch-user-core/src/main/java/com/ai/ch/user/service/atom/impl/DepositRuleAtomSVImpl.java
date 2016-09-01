package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.CtDepositRule;
import com.ai.ch.user.dao.mapper.bo.CtDepositRuleCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IDepositRuleAtomSV;

@Component
public class DepositRuleAtomSVImpl implements IDepositRuleAtomSV {

	@Override
	public List<CtDepositRule> selectByExample(CtDepositRuleCriteria example) {
		return MapperFactory.getCtDepositRuleMapper().selectByExample(example);
	}

}
