package com.ai.ch.user.shopinfo.impl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.shopinfo.interfaces.IShopInfoSV;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class ShopInfoTest {

	@Autowired
	private IShopInfoSV shopInfoSV;
	
	@Test
	public void testQueryRank(){
		QueryShopRankRequest request = new QueryShopRankRequest();
		request.setTenantId("changhong");
		request.setUserId("00002");
		shopInfoSV.queryShopRank(request);
	}
}
