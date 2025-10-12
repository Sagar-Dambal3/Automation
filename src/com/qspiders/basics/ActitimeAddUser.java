package com.qspiders.basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeAddUser {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://localhost/login.do");
		
		//Login
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		//click on user module
		driver.findElement(By.xpath("//div[text()='USERS']")).click();
		
		//create user
		driver.findElement(By.id("createUserDiv")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("sagar");
		driver.findElement(By.name("lastName")).sendKeys("d");
		driver.findElement(By.name("email")).sendKeys("sagard@gmail.com");
		
		driver.findElement(By.name("username")).sendKeys("sagar");
		driver.findElement(By.name("password")).sendKeys("sagar123");
		driver.findElement(By.name("passwordCopy")).sendKeys("sagar123");
		
		driver.findElement(By.id("userDataLightBox_commitBtn")).click();
		
		//click on the created user container
		driver.findElement(By.xpath("//div[@class='name']//span[contains(text(),'sagar')]")).click();
		Thread.sleep(2000);
		
		//click on delete
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		
		//handle confirmation pop-up
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.id("logoutLink")).click();
		
		driver.quit();
	}
}
