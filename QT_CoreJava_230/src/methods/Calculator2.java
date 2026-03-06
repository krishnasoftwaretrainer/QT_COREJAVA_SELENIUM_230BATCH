package methods;

public class Calculator2 //Class-2: + - * / %
{
	public static void ModulusDivision()  //Non-Static Method-5
	{
		int a = 20;
		int b = 10;
		int mod = a%b;
		System.out.println("The Modulus is: " + mod);
	}
	
	public static void main(String[] args) 
	{
		Calculator1 cal1 = new Calculator1();
		cal1.Addition(); //Method Calling
		cal1.Subtraction(); //Method Calling
		Calculator1.Multiplication(); //Method Calling
		Calculator1.Division(); //Method Calling
		Calculator2.ModulusDivision(); //Method Calling
		
	}

}
