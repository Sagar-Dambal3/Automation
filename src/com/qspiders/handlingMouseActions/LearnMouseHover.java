package com.qspiders.handlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.vtiger.com/");
		
		WebElement companyDropdown = driver.findElement(By.id("companyDropdown"));
		Actions a = new Actions(driver);
		a.moveToElement(companyDropdown).perform();
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		String phno = driver.findElement(By.xpath("//p[contains(text(),'Melbourne')]/../p[2]")).getText();
		System.out.println(phno);
		
		driver.quit();

	}

}
