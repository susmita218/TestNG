package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo4 {

	@Test(enabled=false)
	public void webLoginHomelogin()
	{
	//selenium
		System.out.println("webLoginHomelogin");
	}
	
	@Test(groups={"Smoke"})
	public void MobileloginHomeloan()
	{
		//Apium
		System.out.println("MobileloginHomeloan");
	}
	
	@Test(dataProvider="getData")
	public void LoginAPIHomeLoan(String username, String password)
	{
		//Rest API Automation
		System.out.println("LoginAPIHomeLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
@DataProvider
public Object[][] getData()
{
//1st combination- username and password - good credit history	
//2nd combination-username and password - no credit history
//3rd combination- username and password - fradulent credit history
	
	Object[][] data=new Object[3][2];
	
	//1st set  --> good credit history
	data[0][0]="firstusername";
	data[0][1]="firstpassword";
	
	//2nd set  --> no credit history
	data[1][0]="secondusername";
	data[1][1]="secondpassword";
	
	//3rd set--> fradulent credit history
	data[2][0]="thirdusername";
	data[2][1]="thirdpassword";
	
	return data;
}

}
