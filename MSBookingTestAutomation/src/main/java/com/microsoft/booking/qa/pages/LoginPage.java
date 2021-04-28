package com.microsoft.booking.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.microsoft.booking.qa.base.TestBase;

public class LoginPage extends TestBase 
{
	@FindBy(id="i0116")
	WebElement emailidfield;
	
	@FindBy(id="idSIButton9")
	WebElement nextbutton;
	
	@FindBy(id="i0118")
	WebElement passwordfield;
	
	@FindBy(xpath="//input[@id='idSIButton9']")
	WebElement signinbutton;
	
	
	//Initializing the Page Objects:
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public HomePage login(String un, String pwd)
		{
			emailidfield.sendKeys(un);
			nextbutton.click();
			passwordfield.sendKeys(pwd);
			new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
			signinbutton.click();
			new WebDriverWait(driver,30).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
			signinbutton.click(); 
			new WebDriverWait(driver,30).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
			signinbutton.click();
			return new HomePage();
		}
		
		public String verifyHomePageTitle()
		{
			return driver.getTitle();
		}
	
}
