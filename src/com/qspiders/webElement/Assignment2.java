package com.qspiders.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		email.sendKeys("Admin" + Keys.CONTROL+"A");
		email.sendKeys(Keys.CONTROL+"C");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(Keys.CONTROL+"V");
		
		email.clear();
		
		WebElement createButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		boolean buttonDisplayed = createButton.isDisplayed();
		boolean buttonEnableed = createButton.isEnabled();
		
		if(buttonDisplayed == true && buttonEnableed == true) {
			System.out.println("Create new Account button is Displayed and Enabled");
		}
		else {
			System.out.println("Create new Account button is not Displayed and Enabled");
		}
		
		String tagName = createButton.getTagName();
		String text = createButton.getText();
		String att = createButton.getAttribute("href");
		String prop = createButton.getCssValue("background-color");
		
		System.out.println(tagName);
		System.out.println(text);
		System.out.println(att);
		System.out.println(prop);
		
		createButton.click();
		
		WebElement regMobile = driver.findElement(By.name("reg_email__"));
		Dimension size1 = regMobile.getSize();
		
		WebElement regPass = driver.findElement(By.id("password_step_input"));
		Dimension size2 = regPass.getSize();
		
		if(size1.equals(size2)) {
			System.out.println("Mobile number and password field size is same");
		}
		else {
			System.out.println("Mobile number and password field size is not same");
		}
		
		WebElement ele1 = driver.findElement(By.xpath("(//input[@id='sex'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//input[@id='sex'])[2]"));
		WebElement ele3 = driver.findElement(By.xpath("(//input[@id='sex'])[3]"));
		
		int e1 = ele1.getRect().getY();
		int e2 = ele2.getRect().getY();
		int e3 = ele3.getRect().getY();
		
		if(e1 == e2 && e2 == e3) {
			System.out.println("All the 3 radio buttons are aligned properly");
		}else {
			System.out.println("All the 3 radio buttons are not aligned properly");
		}
		
		ele2.click();
		
		if(ele2.isSelected()) {
			System.out.println("Male radio button is selected");
		} 
		else {
			System.out.println("Male radio button is not selected");
		}
		
		driver.findElement(By.name("websubmit")).submit();
		
		driver.quit();
	}
}
