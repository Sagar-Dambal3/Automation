package com.qspiders.handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.className("btn-danger")).click();
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		System.out.println(text);
		
		a.accept();
		driver.quit();

	}

}
