package com.qspiders.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo { //Test class
	@Test
	public void demoA() {  //Test method
		Reporter.log("Hello");
	}
	
	@Test
	public void demoB() {
		Reporter.log("World",true);
	}
}
