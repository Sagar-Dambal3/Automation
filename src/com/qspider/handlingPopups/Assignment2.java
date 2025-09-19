package com.qspider.handlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications","--start-maximized","-incognito");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.pib.gov.in/indexd.aspx");
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		
		driver.findElement(By.linkText("Ministry of Education")).click();
		Alert alrt1 = driver.switchTo().alert();
		alrt1.accept();
		
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);	
//			if (driver.getTitle().contains("प्रमुख पहल")) {
//				driver.findElement(By.className("language-link")).click();
//				Alert alt = driver.switchTo().alert();
//				Thread.sleep(2000);
//				alt.accept();
//				System.out.println(driver.getTitle());
//			}
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
