package loops;

public class PrintTables {

	public static void main(String[] args) {
		// Print 2 Table
		/*
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+ " * 8 = " +(i*8));
			}
			*/
	//Print 2 to 20 Tables
		for(int i=1;i<=10;i++) //2<=20T 
		{
			System.out.println(i+ " Table");
			for(int j=1;j<=10;j++) //1<=10T 
			{
				System.out.println(j+ " * "+ i +" = " +(j*i)); //1*2 2*2 3*2
			}
			System.out.println();
		}
		
	}

}
