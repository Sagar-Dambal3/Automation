package com.qspiders.handlingMouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HeadingsReverseOrder {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://online.actitime.com/tyss/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
		
		driver.findElement(By.xpath("//div[contains(@class,'button_support')]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		
		WebElement link = driver.findElement(By.linkText("Read Service Agreement"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.contextClick(link).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		Set<String> allwid = driver.getWindowHandles();
		Iterator<String> wid = allwid.iterator();
		String pwid = wid.next();
		String cwid = wid.next();
		driver.switchTo().window(cwid);
		List<WebElement> list = driver.findElements(By.xpath("//h2"));
		for(int i = list.size()-1; i > 0; i--) {
			String l = list.get(i).getText();
			System.out.println(l);
		}
		driver.quit();
	}
}
