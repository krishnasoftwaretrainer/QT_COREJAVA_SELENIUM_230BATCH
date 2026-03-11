package dataAbstraction_Interface;

interface Parent1
{
	public void Father1(); //Unimplemented Method
}
interface Parent2
{
	public void Father2(); //Unimplemented Method
}
interface Parent3
{
	public void Father3(); //Unimplemented Method
}

public class Child  implements Parent1,Parent2,Parent3
{
	public void Father1() 
	{
		System.out.println("I am your Father1");
	}
	public void Father2() 
	{
		System.out.println("I am your Father2");
	}
	public void Father3() 
	{
		System.out.println("I am your Father3");
	}
	
	public static void main(String[] args) 
	{
		Child child = new Child();
		child.Father1();
		child.Father2();
		child.Father3();
	}
}
