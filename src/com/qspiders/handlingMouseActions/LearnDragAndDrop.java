package com.qspiders.handlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Actions a = new Actions(driver);
		WebElement ele1 = driver.findElement(By.partialLinkText("Interactions"));
		a.moveToElement(ele1).perform();
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.partialLinkText("Drag and Drop"));
		a.moveToElement(ele2).perform();
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.partialLinkText("Static")); 
		a.click(ele3).perform();
		
		WebElement selenium = driver.findElement(By.id("node"));
		WebElement mongo = driver.findElement(By.id("mongo"));
		WebElement angular = driver.findElement(By.id("angular"));
		WebElement droparea = driver.findElement(By.id("droparea"));
		
		a.dragAndDrop(selenium, droparea).perform();
		a.clickAndHold(mongo).moveToElement(droparea).release().perform();
		a.clickAndHold(angular).moveToElement(droparea).release().perform();
		
	}
}
