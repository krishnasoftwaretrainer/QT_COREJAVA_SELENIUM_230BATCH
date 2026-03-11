package dataAbstraction_Interface;

public abstract class AbstractParent_RBI 
{
	//Declare Unimplemented Method
	
	public abstract void RateOfIntrest(); //5% 6% 7% Only Declare Methods don't implement it
	
	public void BankTime()  //Normal Method Using What
	{
		System.out.println("RBI:Bank Time is 9:00AM to 5:00PM");
	}
	
	public  void MakeaPhoneCall() //Only Declare Methods don't implement it
	{  //What and How 
		System.out.println("Enter Valid 10digit Mobile Number");
		System.out.println("Click on Call Button");
	}
	
	public abstract void HowPhoneCallWorks(); 
	
	/*
	public static void main(String[] args) 
	{
		AbstractParent_RBI rbi = new AbstractParent_RBI(); //We can't create object of abstract class
	} */
	
}
