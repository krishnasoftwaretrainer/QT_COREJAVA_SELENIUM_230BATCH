package exceptionHandling;

public class Arthametic_Exception
{
	
	public static void main(String[] args) 
	{
		/*
		int a = 10;
		int b = 0;
		
		System.out.println("Division: " + (a/b));
		System.out.println("Program Excuted Successfully");
		*/
		
		try 
		{
			int a = 10;
			int b = 0;
			
			System.out.println("Division: " + (a/b));
			System.out.println("No Exception Occured");
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled: " + e.getMessage());
			System.out.println("Exception Handled Successfully");
		}
		
		//Exception=Catch+Finally
		//NoException=Try+Finally
		finally
		{
			System.out.println("Program Excuted Successfully");
		}
	}
}
