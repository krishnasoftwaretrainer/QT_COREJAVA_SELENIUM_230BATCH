package constructors;

public class Parameterized_Constructors {

	 Parameterized_Constructors(int htno,String name,boolean result)
	{
		System.out.println("The HTNO is: " + htno);
		System.out.println("The Name is: " + name);
		System.out.println("The Result is: " + result);
		System.out.println("================================");
		
	}
	
	public static void main(String[] args)
	{
		Parameterized_Constructors pc = new Parameterized_Constructors(12345,"John",true); //Object Creation
		 pc = new Parameterized_Constructors(54321,"Smith",false); //Object Creation
		 pc = new Parameterized_Constructors(67890,"David",true); //Object Creation
		 pc = new Parameterized_Constructors(98765,"Micheal",false); //Object Creation
		
	}
}
