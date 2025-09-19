package com.qspider.handlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnRobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.selenium.dev/");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_P); Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL); Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER); 
		
		
	}
}
