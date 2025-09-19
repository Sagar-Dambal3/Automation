package com.qspiders.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void task(WebDriver driver) throws InterruptedException{
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jspiders.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.qspiders.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		String expectedtitle = "QSpiders | Empowering IT & Software Careers with Comprehensive Courses";
		String expectedurl = "https://qspiders.com/";
		
		
		String actualtitle = driver.getTitle();
		String actualurl = driver.getCurrentUrl();
		
		if(actualtitle.equals(expectedtitle) && actualurl.equals(expectedurl)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.manage().window().setSize(new Dimension(1080,720));
		Thread.sleep(2000);
		
		Point newPosition = new Point(333,456);
		driver.manage().window().setPosition(newPosition);
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
