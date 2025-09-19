package com.qspiders.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://instagram.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}
}
