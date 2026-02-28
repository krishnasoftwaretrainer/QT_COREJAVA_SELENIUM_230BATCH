package conditionalFlow_Statements;

import java.util.Scanner;

public class NuberIs_EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int number = scan.nextInt();
		/*
		if (number % 2 == 0) // 4%2==0 true 5%2==0 false
		{
			System.out.println("The Number " + number + " is Even");
		} 
		else
		{
			System.out.println("The Number " + number + " is Odd");
		} */
		
		if (number % 2 == 1) // 4%2==1 false 5%2==1 true
		{
			System.out.println("The Number " + number + " is Odd");
		} 
		else
		{
			System.out.println("The Number " + number + " is Even");
		}
	}
}
