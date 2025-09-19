package com.qspiders.handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleScenarioYoutubeMusic {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame("app");
		
		WebElement link = driver.findElement(By.xpath("//*[text()='YouTube Music']"));
		Actions a = new Actions(driver);
		a.scrollToElement(link).perform();
		
		link.click();
		

	}

}
