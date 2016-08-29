package com.ai.ch.user.defaultManager.impl.test;


import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.defaultlog.interfaces.IDefaultLogSV;
import com.ai.ch.user.api.defaultlog.params.DefaultLogVo;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.opt.base.vo.PageInfo;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class defaultManagerSVImpl {

	@Autowired
	private IDefaultLogSV defaultLogSV;
	
	@Test
	public void insertDetaultInfoTest(){
		InsertDefaultLogRequest request = new InsertDefaultLogRequest();
		request.setUserId("1");
		request.setDefaultReason("aaa");
		request.setDeductBalance(1212L);
		request.setDeductDate(new Timestamp(new Date().getTime()));
		request.setOperId(1L);
		defaultLogSV.insertDefaultLog(request);
	}
	
	
	@Test
	public void queryDetaultInfoListTest(){
		QueryDefaultLogRequest defaultLogRequest = new QueryDefaultLogRequest();
		defaultLogRequest.setTenantId("ch");
		defaultLogRequest.setUserId("1");
		
		defaultLogRequest.setPageNo(1);
		defaultLogRequest.setPageSize(5);
		
		QueryDefaultLogResponse defaultLogResponse = defaultLogSV.queryDefaultLog(defaultLogRequest);
		System.out.println(JSON.toJSONString(defaultLogResponse.getPageInfo()));
	}
	
}