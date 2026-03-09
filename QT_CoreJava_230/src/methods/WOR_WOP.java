package methods;

public class WOR_WOP 
{
	
	public static void Addition()  //Non-Static Method-1
	{
		int a = 20;
		int b = 10;
		int sum = a+b;
		System.out.println("The Addiition is: " + sum);
	}

	public static void main(String[] args) 
	{
		
		WOR_WOP.Addition(); //Method Calling
		WOR_WOP.Addition(); //Method Calling

	}
}
