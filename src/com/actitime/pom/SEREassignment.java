package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SEREassignment {
	//@FindBy(partialLinkText="Jobs")
	private WebElement jobsBtn;
	
	SEREassignment(WebDriver driver){
		//PageFactory.initElements(driver, this);
		jobsBtn = driver.findElement(By.partialLinkText("Jobs"));
	}
	
	public void clickLoginBtn() {
		jobsBtn.click();
	}
}
