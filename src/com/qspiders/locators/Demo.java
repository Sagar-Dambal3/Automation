package com.qspiders.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Sagar\\OneDrive\\Desktop\\Demo.html");
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
		driver.navigate().back();
		
		WebElement ele1 = driver.findElement(By.id("insta"));
		ele1.click();
		driver.navigate().back();
		
		WebElement ele2 = driver.findElement(By.name("facebook"));
		ele2.click();
		driver.navigate().back();
		
		driver.findElement(By.className("instagram_link")).click();
		driver.quit();

	}

}
