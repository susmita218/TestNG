package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeSuite
	public void BeforeSuiteMethod()
	{
	//selenium
		System.out.println("I am no.1");
	}
	
	@AfterSuite
	public void AfterSuiteMethod()
	{
	//selenium
		System.out.println("I am no.1 from the last");
	}
	
	@Test(groups={"Smoke"})
	public void APILoginHome()
	{
	//selenium
		System.out.println("APILoginHome");
	}

}
