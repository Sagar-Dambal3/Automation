package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirbnbDestHotelList {

	@FindBy(xpath="//div[@data-testid=\"card-container\"]")
	private WebElement hotel1;
	
	@FindBy(xpath="(//div[@data-testid=\"card-container\"])[2]")
	private WebElement hotel2;
	
	@FindBy(xpath="//span[text()='Filters']")
	private WebElement filterBtn;
	
	AirbnbDestHotelList(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHotel1() {
		hotel1.click();
	}
	
	public void clickOnHotel2() {
		hotel2.click();
	}
	
	public void filterBtn() {
		filterBtn.click();
	}
}
