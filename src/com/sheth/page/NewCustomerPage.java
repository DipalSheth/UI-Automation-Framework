package com.sheth.page;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver; 
import com.sheth.util.ByClass;

public class NewCustomerPage {
	
	WebDriver driver;

	public NewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	public String getNewCustomerTitle(){
		return driver.getTitle();
	}
	
	
	
	public String newCustomerPageLink(String name,String uname,String pwd){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(ByClass.getByObject("id-newcustomername")).sendKeys(name);;
		driver.findElement(ByClass.getByObject("name-email")).sendKeys(uname);;
		driver.findElement(ByClass.getByObject("name-pwd")).sendKeys(pwd);
		driver.findElement(ByClass.getByObject("id-newcustomerrecheckpassword")).sendKeys(pwd);
		driver.findElement(ByClass.getByObject("xpath-newcustomercreateaccount")).click();
		return driver.getTitle();
		 
	}

}
