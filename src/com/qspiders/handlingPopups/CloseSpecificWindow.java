package com.qspiders.handlingPopups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title: ");
		String input = sc.nextLine(); 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://secure.indeed.com/");
		
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		
		Thread.sleep(2000);
		
		Set<String> allWId = driver.getWindowHandles();
		
		for (String WId : allWId) {
			Thread.sleep(2000);
			
			driver.switchTo().window(WId);
			String actualTitle = driver.getTitle();
			
			if (actualTitle.contains(input)) {
				driver.close(); //It will close the specific window
			}
		}
		
	}
}
