package com.sheth.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sheth.util.ByClass;



public class SearchDetailsPage{
	
	WebDriver driver;

	public SearchDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getDetailsTitle(){
		return driver.getTitle();
	}
	
	public String resultTitle(){
		WebElement elem = driver.findElement(ByClass.getByObject("xpath-resulttitle"));
		return elem.getText();
	}

}
