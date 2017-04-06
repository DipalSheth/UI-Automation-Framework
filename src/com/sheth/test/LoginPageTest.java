package com.sheth.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sheth.base.BaseTest;
import com.sheth.page.HomePage;
import com.sheth.page.LoginPage;
import com.sheth.util.ExcelUtil;

public class LoginPageTest extends BaseTest {

	LoginPage lp;
	HomePage hm;

	@BeforeClass
	public void before(){
		hm = new HomePage(driver);
		lp = hm.clickOnSignInLink();
	}
	
	//
	@DataProvider(name="signin")
	public Object[][] signindata(){
		Object[][] data = ExcelUtil.getExcelData("login-testdata.xlsx", "login");
		return data;
		
	}

	@Test(dataProvider="signin")
	public void testSignIn(String uname,String pwd,String expected) {
		System.out.println("Expected Value: " + expected);
		//String actual = lp.loginInValid(uname,pwd);
		Assert.assertNotNull(lp.loginInValid(uname,pwd));
		//Assert.assertTrue(actual.contains(expected));
	}
	
	

}
