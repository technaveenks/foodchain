package com.duckafilla.automation.foodchain.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnTestNg {
	
	
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println(" Before Suite ");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println(" After Suite ");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.out.println(" Before Test ");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println(" After Test ");
	}
	@org.testng.annotations.BeforeGroups
	public void BeforeGroups() {
		System.out.println(" Before Groups ");
	}
	@org.testng.annotations.AfterGroups
	public void AfterGroups() {
		System.out.println(" After Groups ");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println(" Before Class ");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println(" After Class ");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println(" Before Method ");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println(" After Method ");
	}
	
	@Test(priority=02)
	public void TestMethod01() {
		System.out.println(" Test Method 01");
	}
	
	@DataProvider(name="testdata")
	public Object[][] dataset(){
		return new Object[][] { { "Bangalore", "hello" }, { "Chennai","hello"}, { "New Delhi","hello"} };
	}
	
	@Test(priority=01,dependsOnMethods = "TestMethod01",enabled=true,dataProvider = "testdata")
	public void TestMethod02(String value, String value2) {
		System.out.println(" Test Method 02");
		System.out.println(" Value from data provider "+ value +"--"+value2);
	}

	
	
}
