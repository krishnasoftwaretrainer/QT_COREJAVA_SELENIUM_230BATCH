package conditionalFlow_Statements;

import java.util.Scanner;

public class NestedIf_SwagLabsLogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username");
		String username = scan.next();
		
		if (username.equals("standard_user")) // T T F 
		{
			System.out.println("Please enter your password");
			String password = scan.next();

			if (password.equals("secret_sauce")) // T F 
			{
				System.out.println("Login successful"); // Executed
			} 
			else //Inner if Condition is false
			{
				System.out.println("Incorrect password"); // Error message
			}
		}
			else // Outer if condition is false
			{
				System.out.println("Incorrect username"); // Error message
		}
		scan.close();
	}

}
