package com.qspiders.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Sagar\\OneDrive\\Desktop\\Demo.html");
		WebElement ele = driver.findElement(By.cssSelector("a[id='fb']"));
		ele.click();
		driver.navigate().back();
		
		WebElement ele1 = driver.findElement(By.cssSelector("a[name='Instagram']"));
		ele1.click();
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("a[class='facebook_link']")).click();
		driver.findElement(By.cssSelector("a[title='Kannada']")).click();
	}
}
