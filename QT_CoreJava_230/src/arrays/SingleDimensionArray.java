package arrays;

import java.util.Scanner;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// Static Input:Array variable declaration and initialization inside program
		//datatype ArrayVariableName[]={Value1,Value2,...};
		//SR MC or MR SC 
		Scanner scan=new Scanner(System.in);
		
		int htno[] = { 101, 102, 103, 104, 105};
		
		for(int i=0;i<htno.length;i++) //0<6,1<6,2<6,3<6,4<6,5<6T,6<6F
		//for(int i=0;i<5;i++) //0<5,1<5,2<5,3<5,4<5T,5<5F
		{
			//System.out.println(htno[i]);
			System.out.print(htno[i]+" ");
		} 
		
		//Dynamic Input: Array variable declaration inside program and initialization at runtime
		//Array Memory Allocation: datatype ArrayVariableName=new datatype[Size];
		/*
		int htno[]=new int[5];
		
		System.out.println("Enter the HTNO of 5 students:");
		for(int i=0;i<5;i++) //0<5,1<5,2<5,3<5,4<5T,5<5F
		{
			htno[i]=scan.nextInt();
			//htno[0]=101,htno[1]=102,htno[2]=103,htno[3]=104,htno[4]=105
		}
		System.out.println("HTNO of 5 students:");
		for(int i=0;i<5;i++) //0<5,1<5,2<5,3<5,4<5T,5<5F
		{
			System.out.println(htno[i]);
			//System.out.print(htno[i]+" ");
		} */
		
		/*
		String sname[]=new String[5];
		
		System.out.println("Enter the names of 5 students:");
		for(int i=0;i<5;i++) //0<5,1<5,2<5,3<5,4<5T,5<5F
		{
			sname[i]=scan.next();
			
		}
		System.out.println("Names of 5 students:");
		for(int i=0;i<5;i++) //0<5,1<5,2<5,3<5,4<5T,5<5F
		{
			System.out.println(sname[i]);
			//System.out.print(sname[i]+" ");
		} */

	}

}
