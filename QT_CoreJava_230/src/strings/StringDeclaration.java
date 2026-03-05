package strings;

import java.util.Scanner;

public class StringDeclaration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String Literal:Pool Concept
		String s1= "java"; //4bytes
		String s2= "java"; //Reference Variable
		System.out.println("Enter a S3 string:");
		//String s3= sc.nextLine();
		String s3= sc.next(); //it will take only the first word as input
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2); //true because both are referring to the same object in the string pool
		System.out.println(s1==s3); //false because s3 is created in the heap memory and s1 is created in the string pool
		System.out.println(s2==s3); //false because s3 is created in the heap memory and s2 is created in the string pool
		System.out.println("==================");
		//scan.next().charAt(0); //it will take only the first word as input and then it will take the first character of that word
		
		//String Object or new keyword
		String s5= new String("java");//4bytes
		String s6= new String("java");//4bytes
		System.out.println("Enter a S7 string:");
		String s7= new String(sc.next());
		
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s5==s6); //false because both are referring to different objects in the heap memory
		System.out.println(s5==s7); //false because both are referring to different objects in the heap memory}
	}
}
