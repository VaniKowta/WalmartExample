package com.wbl.helper;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ByClass {

	public static By getobject(String key){
		By by=null;
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream(Constant.PATH+"/homePageLocator.properties"));
		}  catch (IOException e) {
					e.printStackTrace();
		}
		if(key.startsWith("css")){
			return By.cssSelector(prop.getProperty(key));
			}else if(key.startsWith("xpath")){
				return By.xpath(prop.getProperty(key));
				
			}else if(key.startsWith("linkText")){
				return By.linkText(prop.getProperty(key));
			}else if(key.startsWith("id")){
				return By.id(prop.getProperty(key));
			}else if(key.startsWith("name")){
				return By.name(prop.getProperty(key));
			}	
		
		 
		return by;		
		
		
	}
}

