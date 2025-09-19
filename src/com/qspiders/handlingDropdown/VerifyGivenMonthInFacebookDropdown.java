package com.qspiders.handlingDropdown;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyGivenMonthInFacebookDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
        Select select = new Select(monthDropdown);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month to check: ");
        String inputMonth = sc.nextLine().trim();
        
        List<WebElement> allMonths = select.getOptions();
        boolean found = false;
        
        for (WebElement option : allMonths) {
            if (option.getText().equalsIgnoreCase(inputMonth)) {
                found = true;
                break;
            }
        }
        
        
        if (found) {
            System.out.println("Month \"" + inputMonth + "\" is present in dropdown.");
        } else {
            System.out.println("Month \"" + inputMonth + "\" is NOT present in dropdown.");
        }
        
        sc.close();
        driver.quit();
	}
}
