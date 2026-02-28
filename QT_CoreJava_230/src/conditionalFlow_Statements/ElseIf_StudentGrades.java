package conditionalFlow_Statements;

import java.util.Scanner;

public class ElseIf_StudentGrades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Student Obtained Marks");
		int obtainedmarks = scan.nextInt();

		if (obtainedmarks >= 80 && obtainedmarks<=100)
		{ //110>=80 true 110<=100 false: false
			System.out.println("A Grade");
		}
		else if (obtainedmarks >= 60 && obtainedmarks<80)
		{ // 110>=60 true 110<80 false: false
			System.out.println("B Grade");
		}
		else if (obtainedmarks >= 45 && obtainedmarks<60)
		{ // 110>=45 true 110<60 false: false
			System.out.println("C Grade");
		}
		else if (obtainedmarks >= 35 && obtainedmarks<45)
		{ // 110>=35 true 110<45 false: false
			System.out.println("Pass");
		}
		else if (obtainedmarks >= 0 && obtainedmarks<35)
		{ // 110>=0 true 110<35 false: false
			System.out.println("Fail");
		}		
		else
		{
			System.out.println("Invalid Marks");
		}
			
		scan.close();
	}

}
