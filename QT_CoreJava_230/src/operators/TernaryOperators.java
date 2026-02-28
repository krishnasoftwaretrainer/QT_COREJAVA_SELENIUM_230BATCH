package operators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int obtainedMarks=85;
		System.out.println("Enter obtained marks: ");
		int obtainedMarks=sc.nextInt();
		//boolean result=obtainedMarks>=35?true:false; //85>=35 true
		String result=(obtainedMarks>=35 &&obtainedMarks<=100) ?"Pass":"Fail"; //85>=35 Pass
		//char result=obtainedMarks>=35?'P':'F'; //85>=35 P
		System.out.println("Result: "+result); //true
		
		
	}

}
