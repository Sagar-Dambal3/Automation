package com.qspiders.dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateMultipleCredentials {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./data/writing.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		
		FileInputStream fis1 = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		
		Sheet sheet = wb.getSheet("validateCred");
		int lastRow = sheet.getLastRowNum();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		for(int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			String un = row.getCell(0).getStringCellValue();
			String pwd = row.getCell(1).getStringCellValue();
			
			driver.get(url); Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys(un); Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(pwd); Thread.sleep(2000);
			driver.findElement(By.className("oxd-button")).click(); 
			
			Thread.sleep(2000);
			
			try {
				driver.findElement(By.className("oxd-userdropdown-tab")).click(); Thread.sleep(2000);
				driver.findElement(By.linkText("Logout")).click(); Thread.sleep(2000);
				row.createCell(2).setCellValue("Pass"); Thread.sleep(2000);
			}
			catch(NoSuchElementException e) {
				row.createCell(2).setCellValue("Fail");
			}
		}
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
		driver.quit();
	}
}
