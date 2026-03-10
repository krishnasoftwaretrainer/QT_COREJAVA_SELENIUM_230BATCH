package polymorphism;

public class CompileTime_MOL_NumberOfParameters 
{

	public void Addition(int a, int b)
	{
		int sum = a+b;
		System.out.println("Addition of 2 numbers: "+sum);
	}
	
	public void Addition(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Addition of 3 numbers: "+sum);
	}
	
	public void Addition(int a, int b, int c, int d)
	{
		int sum = a+b+c+d;
		System.out.println("Addition of 4 numbers: "+sum);
	}
	
	public static void main(String[] args) 
	{
		CompileTime_MOL_NumberOfParameters mol = new CompileTime_MOL_NumberOfParameters();
		mol.Addition(10, 20);
		mol.Addition(100, 200, 300);
		mol.Addition(1000, 2000, 3000, 4000);
	}
	
	
	}
