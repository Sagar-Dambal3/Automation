package com.qspiders.handlingDisabledElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraEndToEnd {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.myntra.com/");
		
		WebElement link = driver.findElement(By.linkText("Men"));
		Actions a = new Actions(driver);
		a.moveToElement(link).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sneakers")).click();
		Thread.sleep(2000);
		
		WebElement slider = driver.findElement(By.id("rootRail"));
		a.clickAndHold(slider).moveByOffset(-200, 0).release().perform();

	}

}
