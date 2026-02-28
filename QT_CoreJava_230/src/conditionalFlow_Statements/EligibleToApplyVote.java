package conditionalFlow_Statements;

import java.util.Scanner;

public class EligibleToApplyVote {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Age");
		int age = scan.nextInt();
		if (age >= 18) // 20>=18 true 15>=18 false
		{
			System.out.println("Congratulations! You are eligible to apply for vote");
		} 
		else
		{
			System.out.println("Sorry! You are not eligible to apply for vote");
		}
	}

}
