package conditionalFlow_Statements;

import java.util.Scanner;

public class SwitchCase_Calculator //+ - * / %
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ant Two Values:");
		int a = sc.nextInt(), b = sc.nextInt();
		
		System.out.println("CALCULATOR");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("5.MODULUS");
		/*
		System.out.println("Enter Your Choice:");
		int choice = sc.nextInt();
		char choice = sc.next().charAt(0);
		
		switch(choice)  //1
		{
		case 1:
		{
			int sum = a + b;
			System.out.println("ADDITION: "+sum);
			break;
		}
		case 2:
		{
			int sub = a - b;
			System.out.println("SUBTRACTION: "+sub);
			break;
		}
		
		case 3:
		{
			int mul = a * b;
			System.out.println("MULTIPLICATION: "+mul);
			break;
		}
		
		case 4:
		{
			int div = a / b;
			System.out.println("DIVISION: "+div);
			break;
		}
		
		case 5:
		{
			int mod = a % b;
			System.out.println("MODULUS: "+mod);
			break;
		}
		default:
		{
			System.out.println("INVALID CHOICE");
			break;
		}
	}  */
		/*
		System.out.println("Enter Your Choice:");
		char choice = sc.next().charAt(0);
		
		switch(choice)  //+
		{
		case '+':
		{
			int sum = a + b;
			System.out.println("ADDITION: "+sum);
			break;
		}
		case '-':
		{
			int sub = a - b;
			System.out.println("SUBTRACTION: "+sub);
			break;
		}
		
		case '*':
		{
			int mul = a * b;
			System.out.println("MULTIPLICATION: "+mul);
			break;
		}
		
		case '/':
		{
			int div = a / b;
			System.out.println("DIVISION: "+div);
			break;
		}
		
		case '%':
		{
			int mod = a % b;
			System.out.println("MODULUS: "+mod);
			break;
		}
		default:
		{
			System.out.println("INVALID CHOICE");
			break;
		}  */
		System.out.println("Enter Your Choice:");
		String choice = sc.next().toLowerCase();
		
		switch(choice)  //Addition ADDITION addition
		{
		case "addition":
		{
			int sum = a + b;
			System.out.println("ADDITION: "+sum);
			break;
		}
		case "subtraction":
		{
			int sub = a - b;
			System.out.println("SUBTRACTION: "+sub);
			break;
		}
		case "multiplication":
		{
			int mul = a * b;
			System.out.println("MULTIPLICATION: "+mul);
			break;
		}
		case "division":
		{
			int div = a / b;
			System.out.println("DIVISION: "+div);
			break;
		}
		case "modulus":
		{
			int mod = a % b;
			System.out.println("MODULUS: "+mod);
			break;
		}
		default:
		{
			System.out.println("INVALID CHOICE");
			break;
			
		}
		}
	}
}
