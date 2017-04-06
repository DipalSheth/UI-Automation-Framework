package com.sheth.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sheth.base.BaseTest;
import com.sheth.page.HomePage;
import com.sheth.page.NewCustomerPage;

public class NewCustomerPageTest extends BaseTest {
	
	NewCustomerPage nc;
	HomePage hm;

	@BeforeClass
	public void before(){
		hm = new HomePage(driver);
		nc = hm.clickOnNewCustomerLink();
	}
	
	@Test
	public void testNewCustomer(){
		Assert.assertNotNull(nc.newCustomerPageLink("dipal", "a@a.com", "test123"));
	}


}
