package operators;

import java.util.Scanner;

public class ArthameticOperators {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Static Input Values 
		//int a=20, b=10;
		//float a=20.5f, b=10.5f;
		//Dynamic Input Values
		//System.out.println("Enter any two numbers: ");
		//int a=sc.nextInt(),b=sc.nextInt();
		//float a=sc.nextFloat(),b=sc.nextFloat();
		//byte a=sc.nextByte(),b=sc.nextByte();
		/*
		System.out.println("Addition: "+(a+b)); //15
		System.out.println("Subtraction: "+(a-b)); //5
		System.out.println("Multiplication: "+(a*b)); //50
		System.out.println("Division: "+(a/b)); //2
		System.out.println("Modulus: "+(a%b)); //0
		*/
		/*
		int sum=a+b;  //15
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		
		System.out.println("Addition: "+sum); //15
		System.out.println("Subtraction: "+sub); //5
		System.out.println("Multiplication: "+mul); //50
		System.out.println("Division: "+div); //2
		System.out.println("Modulus: "+mod); //0
		
		int all=sum+sub+mul+div+mod;
		System.out.println("All: "+all); //70
		*/
		
		System.out.println("Addition: "+(20+10)); //15
		System.out.println("Subtraction: "+(20-10)); //5
		System.out.println("Multiplication: "+(20*10)); //50
		System.out.println("Division: "+(20/10)); //2
		System.out.println("Modulus: "+(20%10)); //0
		
		//Priority of Arthametic Operators: () > * / % > + -
		System.out.println("Result: "+(5+3-2*8)); //5+3-16 = -8
	}

}
