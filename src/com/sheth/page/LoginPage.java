package com.sheth.page;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sheth.util.ByClass;


public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLoginTitle(){
		return driver.getTitle();
	}
	
	public String loginInValid(String uname,String pwd){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elm = driver.findElement(ByClass.getByObject("name-email"));
		elm.clear();
		elm.sendKeys(uname);
		elm = driver.findElement(ByClass.getByObject("name-pwd"));
		elm.clear();
		elm.sendKeys(pwd);
		driver.findElement(ByClass.getByObject("id-signinButton")).click();
		return driver.findElement(ByClass.getByObject("css-warningmessageforInvalidLogin")).getText();
		 
	}

	

}
