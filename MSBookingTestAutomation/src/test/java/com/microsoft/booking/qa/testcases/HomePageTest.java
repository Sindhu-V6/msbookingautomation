package com.microsoft.booking.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.booking.qa.pages.LoginPage;
import com.microsoft.booking.qa.utils.TestUtil;
import com.microsoft.booking.qa.base.TestBase;
import com.microsoft.booking.qa.pages.CreateMailBoxPage;
import com.microsoft.booking.qa.pages.HomePage;

public class HomePageTest extends TestBase 
{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CreateMailBoxPage createMailBoxpage;
	
    public HomePageTest()
    {
    	super();
    }
	
	  @BeforeMethod
	  public void setUp()
	  {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		createMailBoxpage =new CreateMailBoxPage();
	  }
	  
	      
	  @Test(priority=0)
	  public void MailboxNameDisplayTest()
	  {
		String homepageTitle= homePage.verifyHomePageTitle();
		Assert.assertEquals(homepageTitle,"Outlook","Home page title is matched");	  	 
	  }
	  
	  
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
