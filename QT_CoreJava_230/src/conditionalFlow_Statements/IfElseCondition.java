package conditionalFlow_Statements;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		//100
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Please Enter Student Obtained Marks");
		int obtainedmarks = scan.nextInt();

		if (obtainedmarks >= 35) // 55>=35 true 30>=35 false
		{
			System.out.println("Congratulations! You have passed the exam");
		} //TBS
		else 
		{
			System.out.println("Sorry! You have failed the exam");
		}*/ //FBS
		
		
		//for(int i=1;i<=5;i++)
		while(true)
		{
			System.out.println("Please Enter Student Obtained Marks");
			int obtainedmarks = scan.nextInt();

			if (obtainedmarks >= 35) // 55>=35 true 30>=35 false
			{
				System.out.println("Congratulations! You have passed the exam");
			} //TBS
			else 
			{
				System.out.println("Sorry! You have failed the exam");
			}
		}
		
		//scan.close();
	}

}
