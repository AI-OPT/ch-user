package com.ai.ch.user.custfile.impl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.custfile.interfaces.ICustFileSV;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class CustFileSVImpl {

	@Autowired
	private ICustFileSV custFileSV;
	
	@Test
	public void testQuery(){
		QueryCustFileExtRequest re = new QueryCustFileExtRequest();
		re.setTenantId("ch");
		System.out.println(JSON.toJSONString(custFileSV.queryCustFileExt(re)));
	}
}
