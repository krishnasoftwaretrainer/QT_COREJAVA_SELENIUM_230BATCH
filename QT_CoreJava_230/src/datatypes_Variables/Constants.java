package datatypes_Variables;

public class Constants 
   {

	public static void main(String[] args) 
	{
		
		final String courseName = "Core Java"; // This is a variable that can be changed
		//courseName = "Core Python"; // Changing the value of courseName
		final int passMarks = 35; // This is a constant value for pass marks
		//passMarks = 40; //Unable to change the value of passMarks, it will cause a compile-time error
		//passMarks = 50; //This is yet another constant value for pass marks
		char gender = 'F'; //This is a variable that char data type
		System.out.println("Pass marks: " + passMarks);
		System.out.println("Course Name: " + courseName);
		System.out.println("Gender: " + gender);
		//4bytes 
		
		/* This is a multi-line comment that can span multiple lines. 
		 * It is used to provide detailed explanations or comments in the code.
		 * In Multi-line comments, you can write as much text as needed without worrying about line breaks.
		 * Normally, multi-line comments are used for documentation purposes or to temporarily disable a block of code during development.
		 * 
		 */
		
		/** This is a Javadoc comment, which is used to generate documentation for Java code. 
		 * It is typically used to describe classes, methods, and fields in a way that can be easily extracted and formatted into HTML documentation.
		 * Javadoc comments start with /** and end with 
		 *and they can include special tags like @param, @return, and @throws to provide additional information about the code elements they describe.
		 */
		 
	}

}
