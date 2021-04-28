package com.microsoft.booking.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.microsoft.booking.qa.base.TestBase;

public class HomePage extends TestBase
{
	
	// Initializing the Page Objects:
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
						
}
