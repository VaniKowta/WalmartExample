package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HelperTest {
	public static String browsername; 
	public static String appUrl;
	
	public static void loadProperties(String filename) throws FileNotFoundException, IOException{
     Properties prop=new Properties();
     prop.load(new FileInputStream(Constant.PATH+filename));
     browsername=prop.getProperty("Browser");
     appUrl=prop.getProperty("appUrl");
     		
	}
	
 public static WebDriver getDriver(){
	 WebDriver driver=null;
	 switch(browsername){
	 case "Firfox":
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\rkowt\\workspace\\WalmartExample\\resources\\geckodriver.exe");
		  driver=new FirefoxDriver();
	 case "Chrome" :	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkowt\\workspace\\walmartExample\\resources\\chromedriver.exe");
		  driver=new ChromeDriver();
	 }
	 return driver;
	 
 }

}
