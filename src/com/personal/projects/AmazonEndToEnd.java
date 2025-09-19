package com.personal.projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEndToEnd {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[][] credentials = {
				{"sagardambal3@gmail.com","9481478454"}
		};
		
		
		for (String[] cred : credentials) {
			try {
				driver.get("https://www.amazon.com/");
				
				driver.findElement(By.id("nav-link-accountList")).click();
				driver.findElement(By.id("ap_email_login")).sendKeys(cred[0]);
				driver.findElement(By.id("continue")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("ap_password")).sendKeys("9481478454");
				Thread.sleep(2000);
				driver.findElement(By.id("signInSubmit")).click();
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
