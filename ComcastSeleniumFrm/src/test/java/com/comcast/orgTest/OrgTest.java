package com.comcast.orgTest;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups="SmokeSuite")
	public void creatOrgTest()
	{
		System.out.println("Execute creatOrgTest ");
	}
	
	@Test(groups="RegressionSuite")
	public void creatContectOrgTest()
	{
		System.out.println("Execute creatContectOrgTest ");
	}
	
	@Test(groups="RegressionSuite")
	public void deleatOrgTest()
	{
		System.out.println("Execute deleatOrgTest ");
	}

}
