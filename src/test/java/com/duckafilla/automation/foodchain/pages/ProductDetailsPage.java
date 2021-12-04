package com.duckafilla.automation.foodchain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{
	
	@FindBy(id="appleItem")
	private WebElement _txtAppleItem;
	
	public void clickOnProduct() {
		_txtAppleItem.click();
	}

}
