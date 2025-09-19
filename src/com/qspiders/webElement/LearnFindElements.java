package com.qspiders.webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		List<WebElement> allEle = driver.findElements(By.tagName("a"));
		int count = allEle.size();
		System.out.println(count);
		
		for(int i = 0; i < count; i++) {
			WebElement ele = allEle.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
