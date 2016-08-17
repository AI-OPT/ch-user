package com.ai.ch.user.score.impl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.score.interfaces.IScoreSV;
import com.ai.ch.user.api.score.param.InsertCurrentScoreRequest;
import com.ai.ch.user.api.score.param.InsertScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryScoreKpiRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogRequest;
import com.ai.ch.user.api.score.param.UpdateCurrentScoreRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class IScoreSVImplTest{

	@Autowired
	private IScoreSV scoreSV;
	
	@Test
	public void QueryScoreKpiTest(){
		QueryScoreKpiRequest request = new QueryScoreKpiRequest();
		request.setTenantId("ch");
		System.out.println(JSON.toJSONString(scoreSV.queryScoreKpi(request)));
	}
	
	@Test
	public void insertScoreTest(){
		InsertScoreLogRequest request = new InsertScoreLogRequest();
		request.setTenantId("ch");
		request.setOperId(1111L);
		request.setTotalScore(80);
		request.setUserId("1234567");
		request.setScore1(66);
		System.out.println(JSON.toJSONString(scoreSV.insertScoreLog(request)));
	}
	
	@Test
	public void queryScoreLogTest(){
		QueryScoreLogRequest request = new QueryScoreLogRequest();
		request.setUserId("1234567");
		request.setTenantId("ch");
		request.setPageSize(10);
		request.setPageNo(10);
		System.out.println(JSON.toJSONString(scoreSV.queryScoreLog(request)));
	}
	
	@Test
	public void insertCurrentTest(){
		InsertCurrentScoreRequest request = new InsertCurrentScoreRequest();
		request.setTenantId("ch");
		request.setTotalScore(89);
		request.setUserId("1234567");
		request.setOperId(1111111111L);
		System.out.println(JSON.toJSONString(scoreSV.insertCurrentScore(request)));
	}
	@Test
	public void updateCurrentTest(){
		UpdateCurrentScoreRequest request = new UpdateCurrentScoreRequest();
		request.setTenantId("ch");
		request.setTotalScore(99);
		request.setUserId("1234567");
		request.setOperId(1111111111L);
		System.out.println(JSON.toJSONString(scoreSV.updateCurrentScore(request)));
	}
	@Test
	public void queryCurrentTest(){
		QueryCurrentScoreRequest request = new QueryCurrentScoreRequest();
		request.setTenantId("ch");
		request.setUserId("1234567");
		System.out.println(JSON.toJSONString(scoreSV.queryCurrentScore(request)));
	}
	
}