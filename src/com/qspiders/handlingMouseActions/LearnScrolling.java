package com.qspiders.handlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 200).perform(); //It will scroll vertically for 200 pixels
		a.scrollByAmount(0, -100).perform(); ////It will scroll back vertically for 100 pixels
		
		WebElement link = driver.findElement(By.linkText("Developers"));
		a.scrollToElement(link).perform(); //It will scroll until an element is visible

	}

}
