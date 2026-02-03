package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement registrationLink;

	@FindBy(id = "customer.firstName")
	WebElement First_Name;

	@FindBy(id = "customer.lastName")
	WebElement Last_Name;

	@FindBy(id = "customer.address.street")
	WebElement Address;

	@FindBy(id = "customer.address.city")
	WebElement city;

	@FindBy(id = "customer.address.state")
	WebElement State;

	@FindBy(id = "customer.address.zipCode")
	WebElement Zip_Code;

	@FindBy(id = "customer.phoneNumber")
	WebElement Phone;
	
	@FindBy(id = "customer.ssn")
	WebElement SSN;

	@FindBy(id = "customer.username")
	WebElement Username;

	@FindBy(id = "customer.password")
	WebElement Password;

	@FindBy(id = "repeatedPassword")
	WebElement Confirm_Pass;
	
	@FindBy(xpath = "//td//input[@type='submit']")
	WebElement registerButton;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void SendRequiredDetails() {
		First_Name.sendKeys("First_Name");
		Last_Name.sendKeys("Last_Name");
		Address.sendKeys("Address");
	}
	public void SendNonMendDetails() {
		city.sendKeys("city");
		State.sendKeys("State");
		Zip_Code.sendKeys("Zip_Code");
		Phone.sendKeys("Phone");
		SSN.sendKeys("SSN");
		Username.sendKeys("Username");
		Password.sendKeys("Password");
		Confirm_Pass.sendKeys("Password");
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}

}
