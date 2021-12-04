package com.duckafilla.automation.foodchain.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.duckafilla.automation.foodchain.pages.HomePage;
import com.duckafilla.automation.foodchain.utils.BaseTest;
import com.duckafilla.automation.foodchain.utils.ReadExcel;

public class SmokeTests extends BaseTest {
	
	HomePage homePage ;
	
	@DataProvider(name="excel")
	public Object[][] getData() throws IOException {
		ReadExcel excel = new ReadExcel();
		return excel.getCellData();
	}
		
	
	
	@Test(dataProvider="excel")
	public void verifyHomePage(String value, String item) {
		System.out.println(value +item);
		
	}
	
	@Test
	public void validateTest() {
		homePage.enterValue();
		homePage.clickOnSearchButton();
	}
	
	@BeforeClass
	public void setup() {
		homePage = new HomePage(getDriver());
	}

}
