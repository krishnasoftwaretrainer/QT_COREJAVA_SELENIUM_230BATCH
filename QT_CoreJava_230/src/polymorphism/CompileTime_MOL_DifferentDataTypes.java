package polymorphism;

public class CompileTime_MOL_DifferentDataTypes 
{
	public void Addition(int a, int b)
	{
		int sum = a+b;
		System.out.println("Addition of 2 numbers: "+sum);
	}
	
	public void Addition(double a, double b)
	{
		double sum = a+b;
		System.out.println("Addition of 2 decimal numbers: "+sum);
	}
	
	public void Addition(float a, float b)
	{
		float sum = a+b;
		System.out.println("Addition of 2 float numbers: "+sum);
	}
	
	public static void main(String[] args) 
	{
		CompileTime_MOL_DifferentDataTypes mol = new CompileTime_MOL_DifferentDataTypes();
		mol.Addition(10, 20);
		mol.Addition(10.5, 20.5);
		mol.Addition(10.5f, 20.5f);
		
	}

}
