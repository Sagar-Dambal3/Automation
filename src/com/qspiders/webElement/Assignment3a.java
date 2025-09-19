package com.qspiders.webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3a {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(5000);
		int count = links.size();
		System.out.println(count);
		
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			System.out.println(url);
		}
		
		driver.quit();
		
	}
}
