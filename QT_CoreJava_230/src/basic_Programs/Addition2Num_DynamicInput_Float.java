package basic_Programs;

import java.util.Scanner;

public class Addition2Num_DynamicInput_Float {

	public static void main(String[] args) {
		// Object Creation for Scanner Class
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Values Here: ");
		float num1 = scan.nextFloat();

		System.out.println("Enter Second Values Here: ");
		float num2 = scan.nextFloat();

		float sum = num1 + num2;
		System.out.print("Addition: " + sum);

	}

}
