package exceptionHandling;

public class ArrayIndexOutOfBound_Exception {

	public static void main(String[] args) {
		/*
		 * int marks[]= {90,80,70,60};
		 * 
		 * for(int i=0; i<5; i++)//0<5,1<5,2<5,3<5,4<5True,5<5False {
		 * System.out.println("Marks: " + marks[i]); }
		 */

		try {
			int marks[] = { 90, 80, 70, 60 };

			for (int i = 0; i < 5; i++)// 0<5,1<5,2<5,3<5,4<5True,5<5False
			{
				System.out.println("Marks: " + marks[i]);
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception Occured: " + e);
			//System.out.println("Exception Handled: " + e.getMessage());
			System.out.println("Exception Handled Successfully");
		}
		
		finally
		{
			System.out.println("Program Excuted Successfully");
		}
	}
}
