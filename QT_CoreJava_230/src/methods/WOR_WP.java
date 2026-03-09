package methods;

public class WOR_WP 
{
	public void Addition(int a, int b)  //Non-Static Method-1
	{
		int sum = a+b;
		System.out.println("The Addiition is: " + sum);
	}
	
	public static void main(String[] args) 
	{
		WOR_WP wp = new WOR_WP();
		wp.Addition(20, 10);
		wp.Addition(-20, -10);
	}
	
}
