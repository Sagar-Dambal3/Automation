package com.qspiders.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpcastingDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		A.test(driver);
		
		//WebDriver driver1 = new EdgeDriver();
		//A.test(driver1);
		
		WebDriver driver2 = new FirefoxDriver();
		A.test(driver2);
	}

}
