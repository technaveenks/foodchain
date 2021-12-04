package com.duckafilla.automation.foodchain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
		
	@FindBy(id="twotabsearchtextbox")
	private WebElement _txtSearchBox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement _btnSearch;
	
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
	public void enterValue() {
		_txtSearchBox.sendKeys("iPhone");
	}
	
	public SearchDetails clickOnSearchButton() {
		_btnSearch.click();
		return new SearchDetails();
	}
	

}
