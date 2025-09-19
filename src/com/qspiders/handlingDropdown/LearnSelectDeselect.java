package com.qspiders.handlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDeselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		
		WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(multiSelect);
		s.selectByIndex(0);
		s.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		s.selectByVisibleText("Mens Cotton Jacket...");
		s.selectByContainsVisibleText("Mens Casual Slim Fit...");
		s.selectByIndex(4);
		s.selectByIndex(5);
		s.selectByIndex(6);
		s.selectByIndex(7);
		
		Thread.sleep(3000);
		
		s.deselectAll();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
