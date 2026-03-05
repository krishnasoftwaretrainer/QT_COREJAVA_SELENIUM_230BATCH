package strings;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a S1 string:");
		String s1= sc.next();
		System.out.println("Enter a S2 string:");
		String s2= sc.next();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //false because both are referring to different objects in the heap memory
	System.out.println("==================");
		String s3="java";
		String s4="selenium";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4); //true because both are referring to the same object in the string pool
	}

}
