package com.duckafilla.automation.foodchain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchDetails extends BasePage{
	
	
	@FindBy(id="appleItem")
	private WebElement _txtAppleItem;
	
	public ProductDetailsPage clickOnProduct() {
		_txtAppleItem.click();
		return new ProductDetailsPage();
	}
	
}
