package loops;

public class PatternPrograms {

	public static void main(String[] args) {
		/* Write a program that prints the following pattern:
		 * 5	4	3	2	1	
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1 
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 */
		
		/* 
		 * 8	8	8	8	8
		 * 7	7	7	7	7
		 * 6	6	6	6	6
		 * 5	5	5	5	5
		 * 4	4	4	4	4
		 * 3	3	3	3	3
		 * 2	2	2	2	2
		 * 1	1	1	1	1
		 */
		/*
		for (int i = 8; i >= 1; i--)  //Rows
		{
			for(int j=5;j>=1;j--) //Columns 
		{
			//System.out.print(j + "   ");
				System.out.print(i + "   ");
		}
			System.out.println(); //Move to the next line after each row is printed
		}  */
		
		/*Write a program that prints the following pattern:
		 * 1 
		 * 1	2
		 * 1	2	3
		 * 1	2	3	4
		 * 1	2	3	4	5
		 */
		
		for(int i=1;i<=10;i++) //1<=5; 2<=5 True
		{
			for(int j=1;j<=i;j++) //1<=1; True j++ 2<=1; False Exit inner loop
			{					 //1<=2; True j++ 2<=2; True 3<=2 False Exit inner loop
				//System.out.print(j + "   ");
				//System.out.print(i + "   ");
				//System.out.print("  ****   ");
				System.out.print(" JAVA  ");
			}
			System.out.println();
		}

	}

}
