package com.comcast.orgTest;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups="SmokeSuite")
	public void creatOrgTest()
	{
		
		System.out.println("Execute creatOrgTest ");
		String Browser = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(Browser);
		System.out.println(URL);
		
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
		
		String Browser = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(Browser);
		System.out.println(URL);
	}

}
