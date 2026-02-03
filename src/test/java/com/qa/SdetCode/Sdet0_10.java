package com.qa.SdetCode;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.MainPage;
import com.qa.pages.RegisterPage;

public class Sdet0_10 extends Base{
	
	public Sdet0_10() throws IOException {
		super();
	}

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = lounchBrowser(prop.getProperty("urlSdet"));
	}
	
	@Test
	public void Sdet01()
	{
		System.out.println("hello");
		
	}
}
