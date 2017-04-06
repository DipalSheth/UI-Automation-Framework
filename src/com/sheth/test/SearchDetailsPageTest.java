package com.sheth.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sheth.base.BaseTest;
import com.sheth.page.HomePage;
import com.sheth.page.SearchDetailsPage;

public class SearchDetailsPageTest extends BaseTest{
	
	SearchDetailsPage sdp;
	HomePage hm;
	
	@BeforeClass
	public void before(){
		hm = new HomePage(driver); 
		//sdp = hm.searchBox();
	}
	
	@Test
	public void testResultTitle(){
		Assert.assertEquals("Amazon.com:  Padgene DZ09 Bluetooth Smart Watch with Camera", sdp.resultTitle());
		
	}

}
