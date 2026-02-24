package basic_Programs;

import java.util.Scanner;

public class Addition2Num_StaticInput 
{

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner( System.in);
		
		int value1=16;  //static Values 
		value1=20;  //value1 is updated with new value
		
		System.out.println("Value1: " + value1);
		System.out.println("Enter Second Values Here: ");
		int value2=scan.nextInt();  //Dynamic Values 
		//int value1=10,value2=20,sum;
		int sum;
		sum=value1+value2;
		//The local variable value2 may not have been initialized
		System.out.print("Addition: " + sum);
		
		
		
		/*
		int value1=20;  //Plain Number:Numeric
		int value2=30;
		int sum;
		
		sum=value1+value2;
		System.out.print("Addition: ");
		System.out.println(sum);
		*/
	}
	
}
