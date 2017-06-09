package com.wbl.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
  WebDriver driver;
  public LoginPage(WebDriver driver){
  	this.driver=driver;
  }
  
	public String login(String username,String passwd){
		String result=null;
		List<WebElement> elements=driver.findElements(By.cssSelector(".form-control"));
		elements.get(0).clear();
		elements.get(0).sendKeys(username);
		elements.get(1).clear();
		elements.get(1).sendKeys(passwd);
	    driver.findElement(By.xpath(".//button[text()='Sign In']")).click();
	  result =driver.getTitle();
	   return result;
	}
	
}
