package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirbnbHomepage {
	@FindBy(id="bigsearch-query-location-input")
	private WebElement searchDestination;
	
	@FindBy(xpath="//div[text()='Check in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//div[text()='Check out']")
	private WebElement checkOut;
	
	@FindBy(xpath="//div[@data-testid='little-search-icon']")
	private WebElement searchBtn;
	
	AirbnbHomepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setSearchDetails(String dest, String inDate, String outDate) {
		searchDestination.sendKeys(dest);
		checkIn.sendKeys(inDate);
		checkOut.sendKeys(outDate);
		searchBtn.click();
	}
}

