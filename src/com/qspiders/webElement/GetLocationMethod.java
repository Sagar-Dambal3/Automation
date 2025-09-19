package com.qspiders.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		int yaxis1 = firstname.getLocation().getY();
		int yaxis2 = surname.getLocation().getY();
			
		if(yaxis1 == yaxis2) {
			System.out.println("Fistname and suname is horizontally aligned properly");
		}
		else {
			System.out.println("Fistname and suname is not horizontally aligned properly");
		}
		
		
		int height1 = firstname.getRect().getHeight();
		int height2 = surname.getRect().getHeight();
		int width1 = firstname.getRect().getWidth();
		int width2 = surname.getRect().getWidth();
		
		
		if(height1 == height2 && width1 == width2) {
			System.out.println("Fistname and suname is vertically aligned properly");
		}
		else {
			System.out.println("Fistname and suname is not vertically aligned properly");
		}
		
		Dimension fnSize = firstname.getSize();
		Dimension lnSize = surname.getSize();
		
		if(fnSize == lnSize) {
			System.out.println("Both are same size");
		}else {
			System.out.println("Both are not same size");
		}
	}
}
