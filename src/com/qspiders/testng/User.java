package com.qspiders.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class User {
		@Test(priority = 3, invocationCount = 3)
		public void createUser() {
			Reporter.log("createUser",true);
		}
		
		@Test(priority = 2, dependsOnMethods = "createUser")
		public void modifyUer() {
			Reporter.log("modifyUer",true);
		}
		
		@Test(enabled = false, priority = 1, dependsOnMethods = {"createUser","modifyUer"})
		public void deleteUser() {
			Reporter.log("deleteUser",true);
		}
}
