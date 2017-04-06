package com.sheth.test;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sheth.base.BaseTest;
import com.sheth.page.HomePage;
import com.sheth.page.LoginPage;

public class HomePageTest extends BaseTest {

	HomePage hm;

	@BeforeClass
	public void before(){
		hm = new HomePage(driver);
	}
	
	@Test
	public void testHomePageLogo(){
		Assert.assertEquals("Amazon",hm.homePageLogo());
	}
	
	@Test
	public void testNavLinks(){
		Assert.assertEquals(1, hm.navLinks());
	}
	
	@Test
	public void testSearchBox(){
		Assert.assertEquals("com.sheth.page.SearchPage@7db12bb6", hm.searchBox());
	}
	
	@Test
	public void testSignInLink(){
		LoginPage lp = hm.clickOnSignInLink();
		Assert.assertEquals("Amazon Sign In", lp.getLoginTitle());
	}
	
	

	

}
