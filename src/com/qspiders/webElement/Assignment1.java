package com.qspiders.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		WebElement cartButton = driver.findElement(By.xpath("(//a[@title='Cart'])[1]"));
	
		if(cartButton.isDisplayed()) {
			cartButton.click();
			
			WebElement messageElement = driver.findElement(By.xpath("//div[text()='Missing Cart items?']"));
			
			System.out.println("Message: " + messageElement.getText());

		}
		else {
			System.out.println("Cart button not present");
		}
		
		driver.quit();
	}
}
