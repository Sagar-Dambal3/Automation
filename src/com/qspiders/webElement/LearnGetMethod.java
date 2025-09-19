package com.qspiders.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		
		//getTagName() is used to get the tag name of a element 
		String tagName = link.getTagName();
		//getText() is used to get the tag text or visible text of an element 
		//if the element is not having tag text it will return empty space
		String text = link.getText();
		//getAttribute(String attributeName) will get the attribute value of an element, 
		//since we have multiple attributes for 1 element we need to mention the attribute name 
		String value = link.getAttribute("href");
		//getCssValue(String propName) will get the css property of an element like color, font size, bg color, 
		//Since we have multiple properties for 1 element we need to mention the property name
		String prop = link.getCssValue("font-size");
		
		System.out.println("Tag Name: " + tagName);
		System.out.println("Tag Text: " + text);
		System.out.println("Attribute value: " + value);
		System.out.println("Css Value: " + prop);
	}
}
