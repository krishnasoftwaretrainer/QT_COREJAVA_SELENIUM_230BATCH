package constructors;

public class Default_Constructors 
{
		/*
		int a=10;
		String name = "John";
		boolean result = true;
		double salary = 25000.50;
		char grade = 'A';
	*/
	int a;
	String name;
	boolean result;
	double salary;
	char grade;

	public static void main(String[] args) 
	{
		Default_Constructors dc = new Default_Constructors(); //Object Creation
		System.out.println("The Value of a is: " + dc.a);
		System.out.println("The Name is: " + dc.name);
		System.out.println("The Result is: " + dc.result);
		System.out.println("The Salary is: " + dc.salary);
		System.out.println("The Grade is: " + dc.grade);
	}
	
}
