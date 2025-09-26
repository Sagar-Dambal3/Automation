package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass{

	@Test(groups = "smokeTest")
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(groups = "regressionTest")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
	@Test(groups = "regressionTest")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
}
