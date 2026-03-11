package dataAbstraction_Interface;

interface RBI  //Parent: Interface Class:Only accept unimplemented methods
{
	public void RateOfInterest();  //What abstract 
	
	/*
	public void BankTime()  //How: Normal Method Using 
	{
		System.out.println("RBI:Bank Time is 9:00AM to 5:00PM");
	}  */
}

public class Child1_SBI implements RBI 
{
	public void RateOfInterest() 
	{
		System.out.println("SBI:Rate of Interest is 5%");
	}
	
	public static void main(String[] args) 
	{
		Child1_SBI sbi = new Child1_SBI();
		sbi.RateOfInterest();
	}
	
	

}
//Child: Normal Class:Implement all unimplemented methods of interface

