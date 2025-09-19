package com.qspiders.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://zerodha.com/");
		Thread.sleep(2000);
		
		String expectedtitle = "Zerodha: Online brokerage platform for stock trading & investing";
		String expectedurl = "zerodha.com/";
		
		String actualtitle = driver.getTitle();
		String actualurl = driver.getCurrentUrl();
		
		if(actualtitle.equalsIgnoreCase(expectedtitle)   && actualurl.contains(expectedurl)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		driver.quit();
	}

}
