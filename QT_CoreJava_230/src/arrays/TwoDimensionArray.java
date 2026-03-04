package arrays;

import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Static Way of Input 2*2=4
		/*
		int arr[][]= {{10,20,5},{30,40,5},{50,60,5}}; //R0 R1 C0 C1
		  
		//for(int i=0;i<2;i++)  //Outer loop for rows
		 for(int i=0;i<arr.length;i++)  //Outer loop for rows
		{
			//for(int j=0;j<2;j++) //Inner loop for columns
			 for(int j=0;j<arr[i].length;j++) //Inner loop for columns
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		} */
		
		//Dynamic Way of Input 2*3=6
		//Memory Allocation for 2D Array: 
		//datatype ArrayVariableName=new datatype[RowSize][ColumnSize];
		
		/*
		int arr[][]=new int[3][3]; //R0 R1 C0 C1 C2=6elements Hard coded value for rows and columns
		
		System.out.println("Enter the arrays elements:");
		
		for(int i=0;i<arr.length;i++)  //Soft Code, Outer loop for rows
		//for(int i=0;i<3;i++)  //Hard coded value for rows
		{
		for(int j=0;j<arr[i].length;j++) // Soft Code Inner loop for columns
		//for(int j=0;j<3;j++) //Hard coded value for columns
			{
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("2D Array elements:");
		for(int i=0;i<arr.length;i++)  //Outer loop for rows
		{
			 for(int j=0;j<arr[i].length;j++) //Inner loop for columns
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		} */
		
		//Dynamic Array Size 
		System.out.println("Enter the number of rows:");
		int row=scan.nextInt();
		System.out.println("Enter the number of columns:");
		int col=scan.nextInt();
		
		int arr[][]=new int[row][col]; //R0 R1 C0 C1 C2=6elements Hard coded value for rows and columns
		
		System.out.println("Enter the arrays elements:");
		
		for(int i=0;i<arr.length;i++)  //Soft Code, Outer loop for rows
		//for(int i=0;i<3;i++)  //Hard coded value for rows
		{
		for(int j=0;j<arr[i].length;j++) // Soft Code Inner loop for columns
		//for(int j=0;j<3;j++) //Hard coded value for columns
			{
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("2D Array elements:");
		for(int i=0;i<arr.length;i++)  //Outer loop for rows
		{
			 for(int j=0;j<arr[i].length;j++) //Inner loop for columns
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
