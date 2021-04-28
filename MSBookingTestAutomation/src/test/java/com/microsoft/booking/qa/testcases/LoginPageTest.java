package com.microsoft.booking.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.microsoft.booking.qa.base.TestBase;
import com.microsoft.booking.qa.pages.HomePage;
import com.microsoft.booking.qa.pages.LoginPage;

public class LoginPageTest extends TestBase 

{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
		
	@Test(priority=0)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    	  
	}
		
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
