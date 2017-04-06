package com.sheth.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sheth.util.ByClass;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String homePageLogo() {
		WebElement elm = driver.findElement(ByClass.getByObject("css-homepagelogo"));
		return elm.getText();
	}

	public int navLinks() {
		List<WebElement> links = driver.findElements(ByClass.getByObject("xpath-navlinks"));
		return links.size();
	}

	public SearchPage searchBox() {
		driver.findElement(ByClass.getByObject("id-searchbox")).sendKeys("watches");
		driver.findElement(ByClass.getByObject("css-searchbox")).click();
		return new SearchPage(driver);
	}

	public LoginPage clickOnSignInLink() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement elm = wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("id-clickonsignin")));
		Actions action = new Actions(driver);
		action.moveToElement(elm).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("linktext-clickonsignin"))).click();
		return new LoginPage(driver); 
	}
	
	public NewCustomerPage clickOnNewCustomerLink(){
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated
		driver.findElement(ByClass.getByObject("id-newcustomerlink"));
		Actions action = new Actions(driver);
		//action.moveToElement(elm).perform();  	
		//wait.until(ExpectedConditions.visibilityOfElementLocated
		driver.findElement(ByClass.getByObject("linktext-newcustomerlink")).click();
		return new NewCustomerPage(driver);
		
	}
	
	public void addToCart(){
		driver.findElement(By.id("nav-cart-count"));
	}

}
