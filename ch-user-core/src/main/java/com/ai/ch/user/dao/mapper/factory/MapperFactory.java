package com.ai.ch.user.dao.mapper.factory;

import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.attach.CtScoreLogAttachMapper;
import com.ai.ch.user.dao.mapper.interfaces.CmCustFileExtMapper;
import com.ai.ch.user.dao.mapper.interfaces.CtCurrentScoreMapper;
import com.ai.ch.user.dao.mapper.interfaces.CtDepositRuleMapper;
import com.ai.ch.user.dao.mapper.interfaces.CtScoreKpiMapper;
import com.ai.ch.user.dao.mapper.interfaces.CtScoreLogMapper;
import com.ai.ch.user.dao.mapper.interfaces.ShopDefaultLogMapper;
import com.ai.ch.user.dao.mapper.interfaces.ShopInfoLogMapper;
import com.ai.ch.user.dao.mapper.interfaces.ShopInfoMapper;
import com.ai.ch.user.dao.mapper.interfaces.ShopRankRuleMapper;
import com.ai.ch.user.dao.mapper.interfaces.ShopScoreKpiMapper;
import com.ai.ch.user.dao.mapper.interfaces.ShopStatDataMapper;

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

	public static CmCustFileExtMapper getCmCustFileExtMapper() {
		return sqlSessionTemplate.getMapper(CmCustFileExtMapper.class);
	}

	public static ShopDefaultLogMapper getShopDefaultLogMapper() {
		return sqlSessionTemplate.getMapper(ShopDefaultLogMapper.class);
	}

	public static ShopInfoMapper getShopInfoMapperMapper() {
		return sqlSessionTemplate.getMapper(ShopInfoMapper.class);
	}
	
	public static CtDepositRuleMapper getCtDepositRuleMapper() {
		return sqlSessionTemplate.getMapper(CtDepositRuleMapper.class);
	}
	
	public static ShopScoreKpiMapper getShopScoreKpiMapper() {
		return sqlSessionTemplate.getMapper(ShopScoreKpiMapper.class);
	}
	public static ShopStatDataMapper getShopStatDataMapper() {
		return sqlSessionTemplate.getMapper(ShopStatDataMapper.class);
	}

	public static ShopInfoLogMapper getShopInfoLogMapper() {
		return sqlSessionTemplate.getMapper(ShopInfoLogMapper.class);
	}
}
