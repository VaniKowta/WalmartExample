package com.wbl.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.wbl.helper.ByClass;


public class HomePage {
    WebDriver driver;
    
    public HomePage(WebDriver driver){
    	this.driver=driver;
    }
    

    public int headerNavLink(){
    	List<WebElement> elements=driver.findElements(By.cssSelector(".header-GlobalEyebrowNav.text-right.font-semibold"));
     return elements.size();  
    }

    public String searchBox(){
  driver.findElement(ByClass.getobject("id-searchLocator")).sendKeys("laptop");
		  	
		 WebDriverWait wait=new WebDriverWait(driver,20);
		String result= wait.until(function);
		return result;
    }
    
    Function<WebDriver,String> function =new Function<WebDriver,String>(){

		public String apply(WebDriver arg0) {
			WebDriverWait wait=new WebDriverWait(driver,30);
			List<WebElement> elements =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ByClass.getobject("css-autosearchLocator")));
			//List<WebElement> elements =driver.findElements(By.cssSelector(autoSearchLocator));
			for (WebElement elm:elements){
				if (elm.getText().equalsIgnoreCase("laptops on sale"))
				{
					elm.click();
					break;
				}
			}
			return driver.getTitle();
		}
		
	};
	
    
	public LoginPage clickSignIn(){
		try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement elm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'My Account')]")));
		Actions action = new Actions(driver);
		action.moveToElement(elm).perform();
		
		
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In"))).click();

			return new LoginPage(driver);
		
		
		
		/*driver.get("https://www.walmart.com/search/?query=laptops%20on%20sale&typeahead=laptop");
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement myAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[1]/a")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		myAccountElement.click();
		
	
		//WebElement myCreateAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By
		

		
		WebElement elm=driver.findElement(ByClass.getobject("xpath-myAccountLocator"));
		
		Actions action = new Actions(driver);
		action.moveToElement(myAccountElement).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In"))).click();
		driver.findElement(By.linkText("Sign In")).click();*/
		
		
	
	}	
    
	public RegisterPage clickCreateAccount(){
	/*	WebDriverWait wait = new WebDriverWait(driver,50);
		WebElement elm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'My Account')]")));
		
		Actions action = new Actions(driver);
		action.moveToElement(elm).perform();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create an Account"))).click();
		
		*/
		

		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement myCreateAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header-GlobalAccountFlyout-flyout-link.dropdown-link.font-bold.display-block.btn-fake-link")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myCreateAccount.click();
		
		Actions action = new Actions(driver);
		action.moveToElement(myCreateAccount).perform();
		
		WebElement elm=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header-GlobalAccountFlyout-link")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		elm.click();
		
		
		/*driver.findElement(By.cssSelector(".header-GlobalAccountFlyout-flyout-link.dropdown-link.font-bold.display-block.btn-fake-link"));
		driver.findElement(By.cssSelector(".header-GlobalAccountFlyout-link")).click();*/
		return new RegisterPage(driver);

	}
		
		
		
		
}



		 
		
	
