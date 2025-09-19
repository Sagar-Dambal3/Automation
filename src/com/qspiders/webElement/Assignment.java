package com.qspiders.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("login")).click();
		
		WebElement error = driver.findElement(By.xpath("//div[contains(text(),'mobile number')]"));
		String errorText = error.getText();
		System.out.println(errorText);
		
		String prop = error.getCssValue("color");
		System.out.println(prop);
		
		WebElement tooltip =  driver.findElement(By.xpath("//a[@title='Kannada']"));
		String value = tooltip.getAttribute("title");
		System.out.println(value);
		
		driver.quit();
	}
}
