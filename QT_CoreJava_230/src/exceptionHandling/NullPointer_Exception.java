package exceptionHandling;

public class NullPointer_Exception {

	public static void main(String[] args) {
		/*
		String name = "Java";
		name = null;
		int length = name.length();
		System.out.println("Length: " + length);
		*/
		
		try
		{
			String name = "Java";
			name = null;
			int length = name.length();
			System.out.println("Length: " + length);
		}
		//catch(NullPointerException e)
		 catch(Exception e)
		{
			 System.out.println(e);
			//System.out.println("Exception Handled: " + e.getMessage());
			System.out.println("Exception Handled Successfully");
		}
		
		finally
		{
			System.out.println("Program Excuted Successfully");
		}
	}

}
