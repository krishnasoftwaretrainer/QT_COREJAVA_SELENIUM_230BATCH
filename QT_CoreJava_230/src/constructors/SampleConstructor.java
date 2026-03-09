package constructors;

public class SampleConstructor
{
	public SampleConstructor() //
	{
		System.out.println("This is a Constructor");
	}
	
	public void SampleMethod()
	{
		System.out.println("This is a Method");
	}
	
	public static void main(String[] args) 
	{
		SampleConstructor sc = new SampleConstructor(); //Object Creation
		sc.SampleMethod(); //Method Calling
	}

}
