package com.ai.ch.user.dao.mapper.factory;

import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.attach.CtScoreLogAttachMapper;
import com.ai.ch.user.dao.mapper.interfaces.CtCurrentScoreMapper;
import com.ai.ch.user.dao.mapper.interfaces.CtScoreKpiMapper;
import com.ai.ch.user.dao.mapper.interfaces.CtScoreLogMapper;
import com.ai.ch.user.dao.mapper.interfaces.ShopRankRuleMapper;

@Component
public class MapperFactory {

	@Autowired
	private SqlSessionTemplate st;

	private static SqlSessionTemplate sqlSessionTemplate;

	@PostConstruct
	void init() {
		setSqlSessionTemplate(st);
	}

	public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		MapperFactory.sqlSessionTemplate = sqlSessionTemplate;
	}

	public static CtCurrentScoreMapper getCtCurrentScoreMapper() {
		return sqlSessionTemplate.getMapper(CtCurrentScoreMapper.class);
	}

	public static CtScoreKpiMapper getCtScoreKpiMapper() {
		return sqlSessionTemplate.getMapper(CtScoreKpiMapper.class);
	}

	public static CtScoreLogMapper getCtScoreLogMapper() {
		return sqlSessionTemplate.getMapper(CtScoreLogMapper.class);
	}

	public static CtScoreLogAttachMapper getCtScoreLogAttachMapper() {
		return sqlSessionTemplate.getMapper(CtScoreLogAttachMapper.class);
	}
	public static ShopRankRuleMapper getShopRankRuleMapper() {
		return sqlSessionTemplate.getMapper(ShopRankRuleMapper.class);
	}
}
