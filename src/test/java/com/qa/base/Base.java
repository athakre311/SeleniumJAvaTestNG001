package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;
	public Properties prop = new Properties();
	
	public WebDriver lounchBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public Base() throws IOException {
		prop = new Properties();
		FileInputStream fis  = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumJAvaTestNG001\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);
	}
	
	

}
