package com.qspiders.handlingPopups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		driver.findElement(By.id("fullName")).sendKeys("Sagar");
		driver.findElement(By.id("emailId")).sendKeys("sagar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sagar");
		driver.findElement(By.id("mobile")).sendKeys("984511335");
		
		WebElement citydropdown = driver.findElement(By.id("city"));
		Select s = new Select(citydropdown);
		s.selectByIndex(1);
		
		//driver.findElement(By.id("resume")).sendKeys("C:\\Users\\Sagar\\Downloads\\demo.txt");
		
		File f = new File("./data/IMG_20250603_203204.jpg");
		String sbPath = f.getAbsolutePath();
		driver.findElement(By.id("resume")).sendKeys(sbPath);
		
		WebElement skills = driver.findElement(By.xpath("//select[@multiple]"));
		Select s1 = new Select(skills);
		
		if(s1.isMultiple()) {
			s1.selectByIndex(0);
			s1.selectByIndex(1);
			s1.selectByIndex(2);
			s1.selectByIndex(3);
			s1.selectByIndex(4);
			s1.selectByIndex(5);
		}
	}
}
