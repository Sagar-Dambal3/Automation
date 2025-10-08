package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SEREassignmentExec {
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		SEREassignment a = new SEREassignment(driver);
		a.clickLoginBtn();
		driver.navigate().back();
		a.clickLoginBtn();
	}
}
