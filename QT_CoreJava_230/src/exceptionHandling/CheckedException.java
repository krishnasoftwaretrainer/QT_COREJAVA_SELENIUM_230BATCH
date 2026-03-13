package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException
{
	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		System.out.println("Program Started");
		Thread.sleep(5000); //Holds the execution 3 seconds
		System.out.println("Program Ended");
		
		FileReader fr = new FileReader("abc.txt"); //Checked Exception
	}

}
