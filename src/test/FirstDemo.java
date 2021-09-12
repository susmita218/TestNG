package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstDemo {

@Parameters({"URL","APIKey"})
	@Test
	public void demo(String URL,String key)
	{
		// TODO Auto-generated method stub
	System.out.println(URL);
	System.out.println(key);
System.out.println("Hello");
	}
	
	@Test
	public void demo2()
	{
		// TODO Auto-generated method stub
System.out.println("Bolo");
	}

}
