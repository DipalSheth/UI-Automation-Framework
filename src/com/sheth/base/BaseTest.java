package com.sheth.base;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.sheth.util.WebUIDriver;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		try {
			WebUIDriver.loadProperties("config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = WebUIDriver.getDriver();
		driver.get(WebUIDriver.appUrl);
		//ByClass.loadProperties();
	}
	
	@AfterSuite
	public void afterSuite(){
		driver.close();
	}
	


}
