package java_Tokens;

public class TypeConversition {

	public static void main(String[] args) {
      //byte short char int long float double  
		/*
		int a=126;
		//long b=a; // implicit type conversion Automatic type conversion
		float b=a; // implicit type conversion 126.0 
		System.out.println(a);
		System.out.println(b);
		
		//float to int 
		float c=12.5f;
		//int d=c;
		int d=(int)c;  //12 
		System.out.println(c);
		System.out.println(d);
		*/
		
		//Char to int
		char ch='a';
		int i=ch; //ASCII value of 'A' is 65
		System.out.println(ch);
		System.out.println(i);
		//int to Char
		int j=97;
		char ch1=(char)j; //Explicit type conversion
		System.out.println(j);
		System.out.println(ch1);
		//Char to float
		char ch2='b';
		float k=ch2; //ASCII value of 'A' is 65
		System.out.println(ch2);
		System.out.println(k);
		
		//float to char
		float m=98.8f;
		char ch3=(char)m; //Explicit type conversion
		System.out.println(m);
		System.out.println(ch3);
		//Implicit type conversion:Automatic type conversion and Widening conversion
		//In implicit type conversion, there is no data loss because the smaller data type is converted to a larger data type. 
		//For example, when an int is assigned to a long, the int value is automatically promoted to a long value without any loss of data.
	
		//Excplicit type conversion:Manual type conversion and Narrowing conversion
		//Type mismatch: cannot convert from float to int
		//Syntax: dataType variableName = (dataType) value;
		//In explicit type conversion, there is a possibility of data loss because the larger data type is converted to a smaller data type.
	
	}

}
