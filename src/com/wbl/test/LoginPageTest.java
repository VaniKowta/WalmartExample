package com.wbl.test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.common.BaseTest;
import com.wbl.helper.Constant;
import com.wbl.helper.ExcelHelper;
import com.wbl.pages.HomePage;
import com.wbl.pages.LoginPage;


public class LoginPageTest extends BaseTest {

	LoginPage lp;
	HomePage hm;
	
	@ BeforeClass
	public void beforeclass(){
          hm=new HomePage(driver);
          lp=hm.clickSignIn();
}
	
	@DataProvider(name="logindata")
	public Object[][] testdata(){
		Object[][] data=ExcelHelper.getdata(Constant.PATH+"/locators/testdata/loginData.xlsx");
		return data;
	}
	@Test(dataProvider="logindata")
	public void testlogin(String username,String passwd){
		Assert.assertNotNull(lp.login(username,passwd));
	}
}
