package com.qspiders.webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("algoshack");
		Thread.sleep(2000);
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'algoshack')]"));
		int count = allSugg.size();
		System.out.println(count);
		
		for (WebElement ele : allSugg) {
			String text = ele.getText();
			System.out.println(text);
		}
		
		WebElement lastEle = allSugg.get(count-1);
		lastEle.click();
		
	}
}
