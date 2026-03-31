package testNG;

import org.testng.annotations.Test;

public class Sample_TestNG_Script {
	
	@Test(priority = -1)
	public void India() 
	{
		System.out.println("I am in India");
	}
	
	@Test(priority = 0)
	public void Telangana() 
	{
		System.out.println("I am in Telangana");
	}
	
	@Test(priority = 3)
	public void Hyderabad() 
	{
		System.out.println("I am in Hyderabad");
	}
	
	@Test(priority = 4, invocationCount = 4)
	public void Ameerpet()
	{
		System.out.println("I am in Ameerpet");
	}
	

	@Test(priority = 5, enabled = false)
	public void Gachibowli() 
	{
		System.out.println("I am in Gachibowli");
	}
	
	
}
