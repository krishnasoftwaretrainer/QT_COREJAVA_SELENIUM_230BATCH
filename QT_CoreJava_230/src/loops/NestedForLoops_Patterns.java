package loops;

public class NestedForLoops_Patterns {

	public static void main(String[] args) {
		/* Write a program that prints the following pattern:
		 * 	1	2	3	4	5
			1	2	3	4	5
			1	2	3	4	5
			1	2	3	4	5
			1	2	3	4	5
		 */
		for (int i = 1; i <= 5; i++)  //Rows
		{
		for(int j=1;j<=5;j++) //Columns 
		{
			System.out.print(i + "   ");
		}
		System.out.println(); //Move to the next line after each row is printed
		}
		/*Explanation:
		 * Outer Loop: 
		 * i=1;i<=5;1<=5; True
		 * Inner Loop:
		 * j=1;j<=5;1<=5; True j++
		 * j=2;j<=5;2<=5; True j++
		 * j=3;j<=5;3<=5; True j++
		 * j=4;j<=5;4<=5; True j++
		 * j=5;j<=5;5<=5; True j++
		 * j=6;j<=5;6<=5; False Exit inner loop
		 * 
		 * Outer Loop:
		 * i++; i=2;i<=5;2<=5; True
		 * Inner Loop:
		 * j=1;j<=5;1<=5; True j++
		 * j=2;j<=5;2<=5; True j++
		 * j=3;j<=5;3<=5; True j++
		 * j=4;j<=5;4<=5; True j++
		 * j=5;j<=5;5<=5; True j++
		 * j=6;j<=5;6<=5; False Exit inner loop
		 * 
			 * Outer Loop:
			 * i++; i=3;i<=5;3<=5; True
			 * Inner Loop:
			 * j=1;j<=5;1<=5; True j++
			 * j=2;j<=5;2<=5; True j++
			 * j=3;j<=5;3<=5; True j++
			 * j=4;j<=5;4<=5; True j++
			 * j=5;j<=5;5<=5; True j++
			 * j=6;j<=5;6<=5; False Exit inner loop
			 *
			 * Outer Loop:
			 * i++; i=4;i<=5;4<=5; True
			 * Inner Loop:
			 * j=1;j<=5;1<=5; True j++
			 * j=2;j<=5;2<=5; True j++
			 * j=3;j<=5;3<=5; True j++
			 * j=4;j<=5;4<=5; True j++
			 * j=5;j<=5;5<=5; True j++
			 * j=6;j<=5;6<=5; False Exit inner loop
			 * Outer Loop:
			 * i++; i=5;i<=5;  5 <=  5 ;True
			 * Inner Loop:
			 * j=1;j<=5;1<=5; True j++
			 * j=2;j<=5;2<=5; True j++
			 * j=3;j<=5;3<=5; True j++
			 * j=4;j<=5;4<=5; True j++
			 * j=5;j<=5;  5 <=  5 ;True j++
			 * j=6;j<=5;6 <=  5 ;False Exit inner loop
		 * Outer Loop:
		 * i++; i=6;i<=5;6<=5; False Exit outer loop
		 * 
		 * Outer Loop Excuted 5 times 
		 * Inner Loop Excuted 25 times (5 times for each iteration of the outer loop)
		 * 1    2   3   4   5    
		 * 1    2   3   4   5	
		 * 1    2   3   4   5
		 * 1	2   3   4   5
		 * 1	2   3   4   5    
		 */
		/* 1 	1 	1 	1 	1
		 * 2 	2 	2 	2 	2
		 * 3 	3 	3 	3 	3
		 * 4 	4 	4 	4 	4
		 * 5 	5 	5 	5	5
		 * 
		 */
	}

}
