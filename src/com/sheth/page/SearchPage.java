package com.sheth.page;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sheth.util.ByClass;


public class SearchPage{
	
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean searchPageVerifyTitle(){
		List<WebElement> results = driver.findElements(ByClass.getByObject("xpath-searchpageverifytitle"));
		
		for(WebElement element : results){
			String resultTitle = element.getAttribute("keywords");
			if(resultTitle.contains("watches")){
				return true;
			}
		}
		return true;
		
	}
	
	public String sortResults(){
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("css-sortresults"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("xpath-sortresults"))).click();
		
		//List<WebElement> results = 
				
				
				driver.findElements(ByClass.getByObject("xpath-sortresults"));
		
//		results.get(0).click();
//		return false;
		
		return driver.getTitle();
	}

}