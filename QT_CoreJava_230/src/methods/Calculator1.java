package methods;

public class Calculator1   //Class-1 + - * /
{
	public void Addition()  //Non-Static Method-1
	{
		int a = 20;
		int b = 10;
		int sum = a+b;
		System.out.println("The Addiition is: " + sum);
	}
	
	public void Subtraction()  //Non-Static Method-2
	{
		int a = 20;
		int b = 10;
		int sub = a-b;
		System.out.println("The Subtraction is: " + sub);
	}
	
	public static void Multiplication()  //Static Method-3
	{
		int a = 20;
		int b = 10;
		int mul = a*b;
		System.out.println("The Multiplication is: " + mul);
	}
	
	public static void Division()  //Static Method-4
	{
		int a = 20;
		int b = 10;
		int div = a/b;
		System.out.println("The Division is: " + div);
	}
	public static void main(String[] args) //Main method
	{
		//Object Creation
		//Same Package and Same Class
		Calculator1 cal1 = new Calculator1();
		cal1.Addition(); //Method Calling
		cal1.Subtraction(); //Method Calling
		Calculator1.Multiplication(); //Method Calling
		Calculator1.Division(); //Method Calling		
		
	}

}
