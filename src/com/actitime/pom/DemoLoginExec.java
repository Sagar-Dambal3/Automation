package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoLoginExec {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		DemoLoginPage d = new DemoLoginPage(driver);
		d.setLogin("admin123", "manager123");
		Thread.sleep(2000);
		d.setLogin("admin", "manager");
	}
}
