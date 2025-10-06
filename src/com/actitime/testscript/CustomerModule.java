package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{

	@Test(groups = "smokeTest")
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(groups = "regressionTest")
	public void deleteCustomer() {
		Assert.fail();
		Reporter.log("deleteCustomer",true);
	}
	@Test(groups = "regressionTest")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
}
