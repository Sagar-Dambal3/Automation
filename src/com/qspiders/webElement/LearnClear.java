package com.qspiders.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClear {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		
		//clear() is used to clear the text present in the textbox
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("password")).clear();
		
		//click() is used to click on the element like (button, link, radio button,checkbox etc)
		driver.findElement(By.xpath("//label[text()='Keep me signed in']")).click();
	}
}
