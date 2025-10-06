package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	@Test(groups = "smokeTest")
	public void createProject() {
		Reporter.log("createProject",true);
	}
	@Test(groups = "regressionTest")
	public void deleteProject() {
		Assert.fail();
		Reporter.log("deleteProject",true);
	}
	@Test(groups = "regressionTest")
	public void modifyProject() {
		Reporter.log("modifyProject",true);
	}
}
