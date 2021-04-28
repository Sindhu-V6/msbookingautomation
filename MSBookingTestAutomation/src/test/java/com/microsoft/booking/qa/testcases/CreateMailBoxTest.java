package com.microsoft.booking.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.booking.qa.base.TestBase;
import com.microsoft.booking.qa.pages.CreateMailBoxPage;
import com.microsoft.booking.qa.pages.HomePage;
import com.microsoft.booking.qa.pages.LoginPage;
import com.microsoft.booking.qa.utils.TestUtil;

public class CreateMailBoxTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	CreateMailBoxPage createmailboxpage;
	TestUtil testUtil;
	
    public CreateMailBoxTest()
    {
   
    	super();
     
    }
	
	  @BeforeMethod
	  public void setUp()
	  {
		initialization();
		createmailboxpage = new CreateMailBoxPage();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		createmailboxpage.createMailBox();    
	  }
	  
	  @Test(priority=0)
		public void MailBoxDisplayTest()
		{
		 boolean mb= createmailboxpage.verifymailboxdisplay();
		 Assert.assertTrue(mb);
		}
	    
	  @Test(priority=1)
	  public void MailboxNameNameTest()
	  {
			String mailboxname= createmailboxpage.verifycreatedMailBoxName();
			Assert.assertEquals(mailboxname,"XMailBox 8","MailBox Name is matched");	  	 
		  }
	  
	   	  
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
