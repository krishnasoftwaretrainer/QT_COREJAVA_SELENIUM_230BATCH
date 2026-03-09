package methods;

public class WR_WOP
{
	public int Addition()
	{
		int a = 20, b = 10;
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args)
	{
		WR_WOP wop= new WR_WOP();
		int result = wop.Addition();
		System.out.println("The Addition is: " + result);
		
		
		
	}
}
