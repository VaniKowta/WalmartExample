package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.common.BaseTest;
import com.wbl.pages.HomePage;



public class HomePageTest extends BaseTest {
	
	HomePage hm;
	@ BeforeClass
	public void beforeclass(){
      hm=new HomePage(driver);

}
	
	@Test
	public void testHeaderNav(){
		Assert.assertEquals(14,hm.headerNavLink());
		
	}
	
	@Test
	public void testSearchbox(){
		//System.out.println(hm.searchBox());
		Assert.assertEquals("laptops on sale - Walmart.com",hm.searchBox());
	}
	
	@Test
	public void testclickSignIn(){
		Assert.assertEquals(true, hm.clickSignIn());
		
	}
	
	@Test
	public void testclickCreateAcct(){
		Assert.assertEquals(true, hm.clickCreateAccount());
		
	}
	
}

