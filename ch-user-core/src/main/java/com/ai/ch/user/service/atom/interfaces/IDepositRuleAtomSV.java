package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.CtDepositRule;
import com.ai.ch.user.dao.mapper.bo.CtDepositRuleCriteria;

public interface IDepositRuleAtomSV {

	 List<CtDepositRule> selectByExample(CtDepositRuleCriteria example);
}
