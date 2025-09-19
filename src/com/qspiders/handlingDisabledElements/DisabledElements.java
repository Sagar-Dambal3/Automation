package com.qspiders.handlingDisabledElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//*[text()='Disabled']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('name').value='sagar'");
		js.executeScript("document.getElementById('email').value='sagar@gmail.com'");
		js.executeScript("document.getElementById('password').value='demo'");
		
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		driver.quit();
		
	}

}
