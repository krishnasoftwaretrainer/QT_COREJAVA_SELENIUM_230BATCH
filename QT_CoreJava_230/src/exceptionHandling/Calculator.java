package exceptionHandling;

public class Calculator {

	public static void main(String[] args) {
		// + - * /
		//need to add Division in exception handling remaining normal
		int a = 20;
		int b = 0;
		try
		{
			 System.out.println("Division: " + (a/b));
					
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled: " + e.getMessage());
		}
		finally
		{
			System.out.println("Addition: " + (a+b));
			System.out.println("Subtraction: " + (a-b));
			System.out.println("Multiplication: " + (a*b));
			
			
		}



	}

}
