package basic_Programs;
import java.util.Scanner;

public class Addition2Num_DynamicInput 
{

	public static void main(String[] args) {
		
		//Object Creation for Scanner Class 
		Scanner scan =new Scanner( System.in);
		
		System.out.println("Enter First Values Here: ");
		int value1=scan.nextInt();
		
		System.out.println("Enter Second Values Here: ");
		int value2=scan.nextInt();
		
		int sum=value1+value2;
		System.out.print("Addition: " + sum);
		
		
		
	}

}
