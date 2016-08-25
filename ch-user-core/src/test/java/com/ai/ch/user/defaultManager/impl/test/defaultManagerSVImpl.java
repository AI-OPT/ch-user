package com.ai.ch.user.defaultManager.impl.test;


import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.defaultlog.interfaces.IDefaultLogSV;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;

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
	
}
