package datatypes_Variables;

import java.util.Scanner;

public class StringTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a String: ");
		//String inputString = sc.nextLine();
		//String inputString = sc.next();
		System.out.println("Enter a Character: ");
		char gender = sc.next().charAt(0);
		System.out.println("You entered: " + gender);
	}

}
