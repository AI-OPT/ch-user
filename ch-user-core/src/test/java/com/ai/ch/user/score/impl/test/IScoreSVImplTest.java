package com.ai.ch.user.score.impl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.score.interfaces.IScoreSV;
import com.ai.ch.user.api.score.param.CountScoreAvgRequest;
import com.ai.ch.user.api.score.param.InsertCurrentScoreRequest;
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
	public void queryScoreLogTest(){
		QueryScoreLogRequest request = new QueryScoreLogRequest();
		request.setUserId("1113dsf33");
		request.setTenantId("ch");
		request.setPageSize(10);
		request.setPageNo(1);
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
	@Test
	public void queryAvgTest(){
		CountScoreAvgRequest request = new CountScoreAvgRequest();
		//request.setTenantId("changhong");
		request.setUserId("100003");
		System.out.println(JSON.toJSONString(scoreSV.countScoreAvg(request)));
	}
	
}
