package com.qspiders.webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement searchButton = driver.findElement(By.name("q"));
		searchButton.sendKeys("iphone 14 pro max" + Keys.ENTER);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]"));
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]/../../../div[2]/div[2]/div[1]"));
		
		for (int i = 0; i < ele.size(); i++) {
			String eleName = ele.get(i).getText();
			String elePrice = ele1.get(i).getText();
			System.out.println(eleName + " --- " + elePrice);
		}
		
		driver.quit();

	}

}
