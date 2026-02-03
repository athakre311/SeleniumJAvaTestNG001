package com.qa.testCases.login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.MainPage;

public class LoginTest extends Base{
	WebDriver driver;
	MainPage mainPage;
	
	
	@BeforeMethod
	public void setup() {
		driver = lounchBrowser();
		mainPage = new MainPage(driver);
	}
	
	@Test
	public void loginWithValidCredentials() {
		mainPage.enterUserName("Abhishek.thakre");
		mainPage.EnterPassword("Abhi@123");
		mainPage.clickOnloginButton();
	}
	
	@Test
	public void loginWithInvalidCredentials() {
		mainPage.enterUserName("uname");
		mainPage.EnterPassword("pass");
		mainPage.clickOnloginButton();
	}

	
	@Test
	public void loginWithoutCredentials() {
		mainPage.clickOnloginButton();
	}
	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
	        driver.quit();
	    }
	}
	

	
	

}
