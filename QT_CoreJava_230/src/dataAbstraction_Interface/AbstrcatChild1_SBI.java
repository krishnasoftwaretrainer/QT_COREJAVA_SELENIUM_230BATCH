package dataAbstraction_Interface;

public class AbstrcatChild1_SBI extends AbstractParent_RBI
{

	public void RateOfIntrest() //Owner 
	{
		System.out.println("SBI:Rate of Intrest 9%");
	}
	
	public void HowPhoneCallWorks() 
	{
		System.out.println("SBI:How Phone Call Works");
		System.out.println("Dial the Number");
		System.out.println("Wait for the call to connect");
		System.out.println("Start Conversation");
	}
	
	public static void main(String[] args) 
	{
		AbstrcatChild1_SBI sbi = new AbstrcatChild1_SBI();
		sbi.RateOfIntrest();
		sbi.BankTime();
		sbi.MakeaPhoneCall();
		sbi.HowPhoneCallWorks();
		
	}
	
}
