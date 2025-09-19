package com.qspiders.basics;

import org.openqa.selenium.WebDriver;

public class A {
	public static void test(WebDriver driver) {
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.close();
	}
}
