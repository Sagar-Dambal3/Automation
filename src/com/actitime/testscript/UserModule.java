package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class UserModule extends BaseClass{
	@Test(groups = "smokeTest")
	public void createUser() {
		Reporter.log("createUser",true);
	}
	@Test(groups = "regressionTest")
	public void deleteUser() {
		Reporter.log("deleteUser",true);
	}
	@Test(groups = "regressionTest")
	public void modifyUser() {
		Reporter.log("modifyUser",true);
	}
}
