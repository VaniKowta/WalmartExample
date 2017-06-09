package com.wbl.common;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.wbl.helper.HelperTest;

public class BaseTest {
   protected WebDriver driver;
   
	@BeforeSuite	
	public void beforesuite(){
		try {
			HelperTest.loadProperties("config.properties");
				} catch (IOException e) {
				e.printStackTrace();
		}
		driver=HelperTest.getDriver();
		driver.get(HelperTest.appUrl);
		
			}
	
	@AfterSuite
  public void aftersuite(){
	  driver.close();
  }
}


