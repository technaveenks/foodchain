package com.duckafilla.automation.foodchain.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\Trainings\\foodchain\\lib\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
