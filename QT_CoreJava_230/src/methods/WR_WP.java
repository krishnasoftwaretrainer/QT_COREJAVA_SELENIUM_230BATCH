package methods;

public class WR_WP 
{

	public double Addition(double a, double b)  //Non-Static Method-1
	{
		double sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		WR_WP wp=new WR_WP();
		double result1 = wp.Addition(20.5, 10.5);
		double result2 = wp.Addition(-20.5, -10.5);
		double result3 = wp.Addition(20.5, -10.5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}
}
