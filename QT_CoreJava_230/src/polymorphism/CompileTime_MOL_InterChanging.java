package polymorphism;

public class CompileTime_MOL_InterChanging 
{
	public void Addition(int a, double b)
	{
		double sum = a+b;
		System.out.println("Addition of int and double: "+sum);
	}
	
	public void Addition(double a, int b)
	{
		double sum = a+b;
		System.out.println("Addition of double and int: "+sum);
	}
	public void Addition(double a, float b)
	{
		double sum = a+b;
		System.out.println("Addition of double and int: "+sum);
	}
	public static void main(String[] args) 
	{
		CompileTime_MOL_InterChanging mol = new CompileTime_MOL_InterChanging();
		mol.Addition(10, 20.5);
		mol.Addition(10.5, 20);
		mol.Addition(10.5, 20.5f);
		
	}

}
