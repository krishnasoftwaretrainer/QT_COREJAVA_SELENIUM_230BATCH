package dataAbstraction_Interface;

public class AbstrcatChild1_HDFC 
{

	public void RateOfIntrest() //Owner 
	{
		System.out.println("HDFC:Rate of Intrest 7%");
	}
	
	public static void main(String[] args) 
	{
		AbstrcatChild1_HDFC hdfc = new AbstrcatChild1_HDFC();
		hdfc.RateOfIntrest();
		
		
	}
}
