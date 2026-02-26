package java_Tokens;

import java.util.Scanner;

public class DataTypes_DynamicWay {

	public static void main(String[] args) {
		//Student Details Program 
		//byte short int long float double char boolean String
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Age: ");
		byte age = sc.nextByte();
		
		System.out.print("Enter Roll No: ");
		short rollNo = sc.nextShort();
		
		System.out.print("Enter Phone No: ");
		int phoneNo = sc.nextInt();
		
		System.out.print("Enter Aadhar No: ");
		long aadharNo = sc.nextLong();
		
		System.out.print("Enter Height: ");
		float height = sc.nextFloat();
		
		System.out.print("Enter Weight: ");
		double weight = sc.nextDouble();
		
		System.out.print("Enter Grade: ");
		char grade = sc.next().charAt(0);
		
		System.out.print("Passed (true/false): ");
		boolean isPassed = sc.nextBoolean();
		
		System.out.println("\nStudent Details:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Phone No: " + phoneNo);
		System.out.println("Aadhar No: " + aadharNo);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Grade: " + grade);
		System.out.println("Passed: " + isPassed);
		
		
	}

}
