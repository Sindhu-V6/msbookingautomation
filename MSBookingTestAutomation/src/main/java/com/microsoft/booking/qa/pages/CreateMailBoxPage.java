package com.microsoft.booking.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.microsoft.booking.qa.base.TestBase;

public class CreateMailBoxPage extends TestBase 
{
	//PageFactory-Object Repositories
		
		@FindBy(className="_7mKA1Ykw-N6Cq2ybKDhFE")
		WebElement createdropdownbutton;
		
		@FindBy(xpath = "//div[@class='tooltipItem option']")
		WebElement waitfornewbutton;
		
		@FindBy(xpath = "//input[@placeholder='Business name']")
		WebElement businessName;
		
		@FindBy(xpath = "//input[@placeholder='Business type']")
		WebElement businessType;
		
		@FindBy(xpath = "//span[starts-with(text(),'Continue')]")
		WebElement waitforcontinuebutton;
		
		@FindBy(xpath = "//span[contains(@class,'ms-Button-label label-110')]")
		WebElement waitforokbutton;
		
		@FindBy(xpath = "//span[@class='_1-GTz9qrvw9tF9_91ha-br']")
		WebElement createdmailboxname;
		
		
		// Initializing the Page Objects:
		public CreateMailBoxPage() 
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public void createMailBox()
		{
			createdropdownbutton.click();
			waitfornewbutton.click();
			businessName.sendKeys("XMailBox 8");
			businessType.sendKeys("AAA");
			waitforcontinuebutton.click();
			
		}
		
		public boolean verifymailboxdisplay()
		{
			
			return createdmailboxname.isDisplayed();
		}
		
		public String verifycreatedMailBoxName()
		{
			return createdmailboxname.getText();
			
		}
		
		
}
