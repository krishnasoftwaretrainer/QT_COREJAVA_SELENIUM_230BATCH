package arrays;

import java.util.Scanner;

public class AdditionofArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Dynamic Array Size
		System.out.println("Enter the number of rows:");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns:");
		int col = scan.nextInt();

		// first array
		int a[][] = new int[row][col]; // R0 R1 C0 C1 C2=6elements Hard coded value for rows and columns

		System.out.println("Enter the first arrays elements:");

		for (int i = 0; i < a.length; i++) // Soft Code, Outer loop for rows
		// for(int i=0;i<3;i++) //Hard coded value for rows
		{
			for (int j = 0; j < a[i].length; j++) // Soft Code Inner loop for columns
			// for(int j=0;j<3;j++) //Hard coded value for columns
			{
				a[i][j] = scan.nextInt();
			}
		}

		// Second array
		int b[][] = new int[row][col];  // R0 R1 C0 C1 C2=6elements Hard coded value for rows and columns
		System.out.println("Enter the second arrays elements:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		// Addition of two arrays
		System.out.println("Addition of two arrays:");
		int sum[][] = new int[row][col]; 
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
