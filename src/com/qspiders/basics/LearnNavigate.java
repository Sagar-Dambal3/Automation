package com.qspiders.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNavigate {
public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://qspiders.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https://jspiders.com");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.close();
	}
}
