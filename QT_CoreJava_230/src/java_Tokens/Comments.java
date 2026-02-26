package java_Tokens;

public class Comments {

	public static void main(String[] args) {

		//Single Line Comments
		// This is a single-line comment. It is used to provide brief explanations or comments about the code.
		
		System.out.println("This is a Single-line comment example."); // This comment is at the end of a line of code
		//System.out.println("This is a Multi-line comment example."); 
		
		//Multi Line Comments 
		/* This is a multi-line comment that can span multiple lines. 
		 * It is used to provide detailed explanations or comments in the code.
		 * In Multi-line comments, you can write as much text as needed without worrying about line breaks.
		 * Normally, multi-line comments are used for documentation purposes or to temporarily disable a block of code during development.
		 * 
		 */
		//Documentation Comments
		/** This is a Javadoc comment, which is used to generate documentation for Java code. 
		 * It is typically used to describe classes, methods, and fields in a way that can be easily extracted and formatted into HTML documentation.
		 * Javadoc comments start with /** and end with 
		 *and they can include special tags like @param, @return, and @throws to provide additional information about the code elements they describe.
		 */
		
		//Small to Big
		int a=10;
		float b=a;
		System.out.println("Value of a: " + b);
		
		//Big to Small
		float c=10.5f;
		int d=c;
		System.out.println("Value of c: " + d);
		//Type mismatch: cannot convert from float to int
		//
	}

}
