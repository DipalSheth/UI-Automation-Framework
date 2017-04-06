package com.sheth.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;



public class ByClass {
	
static Properties prop;
	
	 static {
			try {
				prop = ConfigUtils.loadProperties("/locators/UI-locators.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	//create By object for locator and return the object
	public static By getByObject(String key){
		String value=prop.getProperty(key);	
		By by=null;
			if(key.startsWith("css")){
				by = By.cssSelector(value);
	        }else if(key.startsWith("xpath")){
	        	by = By.xpath(value);
	        }else if(key.startsWith("link")){
	        	by = By.linkText(value);
	        }else if(key.startsWith("id")){
	        	by = By.id(value);
	        }else if(key.startsWith("partialLink")){
	        	by = By.partialLinkText(value);
	        }else if(key.startsWith("tag")){
	        	by = By.tagName(value);
	        }else if(key.startsWith("class")){
	        	by = By.className(value);
	        }else if(key.startsWith("name")){
	        	by = By.name(value);
	        }
			
		
		return by;
	}

}
