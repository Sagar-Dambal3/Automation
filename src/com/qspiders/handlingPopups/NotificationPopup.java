	package com.qspiders.handlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications","--start-maximized","-incognito");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://yatra.com");
		System.out.println(driver.getTitle());

	}

}
