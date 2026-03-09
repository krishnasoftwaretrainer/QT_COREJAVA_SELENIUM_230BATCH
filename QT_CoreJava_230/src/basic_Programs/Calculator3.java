package basic_Programs;
import methods.Calculator1;
import methods.Calculator2;

public class Calculator3 //+ - * / %
{
	
	public static void main(String[] args) 
	{
		//Different Package and Different Class
		Calculator1 cal1= new Calculator1();
		cal1.Addition(); //Method Calling
		cal1.Subtraction(); //Method Calling
		//Calculator1.Subtraction(); //Method Calling
		//Calculator1.Multiplication(); //Method Calling
		cal1.Multiplication(); //Method Calling
		Calculator1.Division(); //Method Calling
		Calculator2.ModulusDivision(); //Method Calling
		
	}

}
