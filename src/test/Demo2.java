package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void webLoginCarlogin()
	{
	//selenium
		Assert.assertTrue(false);
		System.out.println("webLoginCarlogin");
	}
	
	@Test(groups={"Smoke"})
	public void Mobilelogincarloan()
	{
		//Apium
		System.out.println("Mobilelogincarloan");
	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		//Rest API Automation
		System.out.println("LoginAPIcarLoan");
	}
	
	
	@BeforeMethod
	public void beforeMethodTest()
	{
	//selenium
		System.out.println("beforeMethodTest in Demo2 class");
	}
	
	@AfterMethod
	public void AfterMethodTest()
	{
	//selenium
		System.out.println("@AfterMethod in Demo2 class");
	}

}
