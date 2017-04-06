package com.sheth.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sheth.base.BaseTest;
import com.sheth.page.HomePage;
import com.sheth.page.SearchPage;

public class SearchPageTest extends BaseTest {
	
	SearchPage sp;
	HomePage hm;
	
	@BeforeClass
	public void before(){
		hm = new HomePage(driver); 
		sp = hm.searchBox();
	}
	
	@Test
	public void testSearchPageVerifyTitle(){
		Assert.assertTrue(sp.searchPageVerifyTitle());
	}
	
	@Test
	public void testSortResults(){
		Assert.assertEquals("Amazon.com: Casio Men's MQ24-1E Black Resin Watch: Casio: Watches", sp.sortResults());
	}

}
