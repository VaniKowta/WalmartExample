

package com.wbl.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//factory pattern

public class WebUIDriver {
	public static String browserName; 
	
	public static void loadProperties(String fileName) throws FileNotFoundException, IOException{
		
     Properties prop= new Properties();
    
     browserName =  prop.getProperty("browser");
     		
	}
	
 public static WebDriver getDriver(){
	 
	 WebDriver driver=null;
	 
	 switch(browserName){
	 
	 case "Firefox":
		 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\resources+\\geckodriver.exe");
		  driver=new FirefoxDriver();
	 case "Chrome":	
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		  driver=new ChromeDriver();
	 case "default":
		 
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		  driver=new ChromeDriver();
	 }
	 return driver;
	 
 }

}