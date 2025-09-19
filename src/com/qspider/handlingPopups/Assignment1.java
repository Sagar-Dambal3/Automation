package com.qspider.handlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.careinsurance.com/");
		driver.findElement(By.id("renew_nav")).click();
		
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			
			if(driver.getTitle().contains("Policy Renewal")) {
				driver.findElement(By.id("policynumber")).sendKeys("123");
				
				WebElement dob = driver.findElement(By.id("dob"));
				dob.click();
				WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
				Select s = new Select(month);
				s.selectByIndex(1);
				WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
				Select s1 = new Select(year);
				s1.selectByValue("1999");
				driver.findElement(By.xpath("//a[@data-date='21']")).click();
				
				driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
				
				driver.findElement(By.id("renew_policy_submit")).click();
				
				WebElement errMsg = driver.findElement(By.id("policynumberError"));
				System.out.println(errMsg.getText());
				
				driver.quit();		
			}
		}
	}
}
