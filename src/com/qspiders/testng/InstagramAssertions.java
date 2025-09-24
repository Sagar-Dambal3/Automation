package com.qspiders.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InstagramAssertions {
	@Test
	public void verifyInstagramTitle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.instagram.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Instagram";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}
	
	@Test
	public void verifyLoginButton() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("sagardambal3@gmail.com");
		driver.findElement(By.name("password")).sendKeys("admin");
		
		boolean loginButoon = driver.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
		SoftAssert s = new SoftAssert();
		s.assertTrue(loginButoon);
		driver.quit();
		s.assertAll();
	}
}
