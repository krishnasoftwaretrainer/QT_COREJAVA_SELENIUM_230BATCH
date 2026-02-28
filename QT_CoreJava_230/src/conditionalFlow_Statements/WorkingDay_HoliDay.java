package conditionalFlow_Statements;

import java.util.Scanner;

public class WorkingDay_HoliDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Day Name");
		String dayName = scan.nextLine().toUpperCase();
		/*
		 if (dayName.equals("Monday") || 
			dayName.equals("Tuesday") || 
			dayName.equals("Wednesday") || 
			dayName.equals("Thursday") || 
			dayName.equals("Friday"))
		 {*/
		
		if (dayName.equalsIgnoreCase("Monday") ||
				dayName.equalsIgnoreCase("Tuesday") ||
				dayName.equalsIgnoreCase("Wednesday") ||
				dayName.equalsIgnoreCase("Thursday") ||
				dayName.equalsIgnoreCase("Friday"))
			{
			System.out.println(dayName + " is a Working Day");
			
		} 
		 
		 else 
			 {
			 System.out.println(dayName + " is a Holiday");
		} 


}

}
