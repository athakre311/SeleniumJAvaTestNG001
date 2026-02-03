package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameField;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginButton;
	

	@FindBy(xpath = "//a[text()='Register']")
	WebElement registrationLink;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String uname) {
		userNameField.sendKeys(uname);
	}

	public void EnterPassword(String pass) {
		passwordField.sendKeys(pass);
	}
	
	public void clickOnloginButton() {
		loginButton.click();
	}
	

	public void clickOnRegistrationLink() {
		registrationLink.click();
	}

}
