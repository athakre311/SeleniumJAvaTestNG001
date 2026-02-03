package com.qa.testCases.registration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.MainPage;
import com.qa.pages.RegisterPage;

public class RegisterWithoutData extends Base{
	WebDriver driver;
	MainPage mainPage;
	RegisterPage registerPage;
	
	@BeforeMethod
	public void setup() {
		driver = lounchBrowser();
		mainPage = new MainPage(driver);
		registerPage = new RegisterPage(driver);
	}
	
	
	@Test
	public  void registerSuccessfull01() {
		mainPage.clickOnRegistrationLink();
		registerPage.clickRegisterButton();
	}

}
