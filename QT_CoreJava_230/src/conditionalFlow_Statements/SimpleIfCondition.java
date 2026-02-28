package conditionalFlow_Statements;

import java.util.Scanner;

public class SimpleIfCondition {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter Student Obtained Marks");
    int obtainedmarks = scan.nextInt();
    
    if(obtainedmarks>=35)  //55>=35 true 30>=35 false
    {
		System.out.println("Congratulations! You have passed the exam");
	}
    
    }

}
