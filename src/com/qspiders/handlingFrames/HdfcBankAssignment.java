package com.qspiders.handlingFrames;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HdfcBankAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hdfcbank.com/");
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		Actions a=new Actions(driver);
		a.moveToElement(login).perform();
		driver.findElement(By.linkText("NetBanking")).click();
		Set<String> allLink = driver.getWindowHandles();
		for (String string : allLink) {
			driver.switchTo().window(string);
		}
		driver.switchTo().frame(0);
		driver.findElement(By.partialLinkText("More...")).click();
		Set<String> allLink2 = driver.getWindowHandles();
		for (String string : allLink2) {
			driver.switchTo().window(string);
		}
		 List<WebElement> language = driver.findElements(By.xpath("//p[contains(text(),'Download the Secure')]//a"));
		 for (WebElement webElement : language) {
		System.out.println(webElement.getText());
		}
		 Thread.sleep(5000);
		driver.quit();


	}

}
