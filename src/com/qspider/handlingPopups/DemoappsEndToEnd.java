package com.qspider.handlingPopups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoappsEndToEnd {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		
		Thread.sleep(2000); 
		
		Set<String> allwid = driver.getWindowHandles();
		
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			String actualTitle = driver.getTitle();
			
			if (actualTitle.contains("Laptop")) {
				break;
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		//driver.findElement(By.className("rounded-full")).click();
		driver.findElement(By.tagName("svg")).click();
		WebElement ele = driver.findElement(By.xpath("//h3[contains(text(),'Laptop')]"));
		System.out.println(ele.getText());

		driver.quit();
	}

}
