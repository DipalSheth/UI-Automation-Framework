package com.sheth.util;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebUIDriver {
    
	public static String browserName;
	public static String appUrl;
	
	public static void loadProperties(String fileName) throws FileNotFoundException, IOException{
		   Properties prop = ConfigUtils.loadProperties(fileName);
		   browserName = prop.getProperty("browser");
		   appUrl= prop.getProperty("appUrl");
	}
	
	public static WebDriver getDriver(){
		WebDriver driver = null;
		
		switch(browserName){
		case "firefox":
			System.setProperty("webdriver.firefox.driver",Constants.PATH+"\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "chrome":
		    System.setProperty("webdriver.chrome.driver",Constants.PATH+"\\chromedriver.exe");
            driver = new ChromeDriver();
            break;
            
		case "safari":
			System.setProperty("webdriver.safari.driver",Constants.PATH+"\\safaridriver.exe");
	        driver = new ChromeDriver();
	        break;
		
		case "ie":
			System.setProperty("webdriver.ie.driver",Constants.PATH+"\\chromedriver.exe");
	        driver = new InternetExplorerDriver();
	        break;
	        
		case "htmlunit":
			driver = new HtmlUnitDriver();
			break;
			
		default:
			System.setProperty("webdriver.chrome.driver",Constants.PATH+"\\chromedriver.exe");
            driver = new ChromeDriver();
			
		}
		
		return driver;
	}
	
}
