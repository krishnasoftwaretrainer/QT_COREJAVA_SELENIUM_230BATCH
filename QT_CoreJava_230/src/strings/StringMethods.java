package strings;

public class StringMethods {

	public static void main(String[] args) {
		//String length() method
		//Lengnth method finds the length of the string and returns the length as an integer value. 
		/*
		String s1= "java selenium";
		//System.out.println("Length:"+s1.length()); //4
	     int len=s1.length();
	     System.out.println("Length:"+len);
	
		//String UpperCase() method
		//toUpperCase() method converts all the characters of the string to uppercase[Capital] and returns the new string.
		String s2= "java selenium";
		System.out.println("Original String:"+s2);
		System.out.println("UpperCase:"+s2.toUpperCase());
		
		//String LowerCase() method
		//toLowerCase() method converts all the characters of the string to lowercase[Small] and returns the new string.
		String s3= "JAVA SELENIUM";
		System.out.println("Original String:"+s3);
		System.out.println("LowerCase:"+s3.toLowerCase());
	
		//String Replace() method
		//replace() method replaces all the occurrences of a character or a substring in the string with another character or substring and returns the new string.
		String s4= "jaea selenium";
		System.out.println("Original String:"+s4);
		//System.out.println("Replace:"+s4.replace('e', 'v'));
		System.out.println("Replace:"+s4.replace("jaea", "Automation"));
	
		//String charAt() method
		//charAt() method returns the character at the specified index in the string. The index starts from 0.
		String s5= "java selenium";
		System.out.println("Original String:"+s5);
		System.out.println("charAt(0):"+s5.charAt(5)); //j
	
		//String trim() method
		//trim() method removes the leading and trailing white spaces from the string and returns the new string.
		String s6= "   java    selenium   ";
		System.out.println("Original String:"+s6);
		System.out.println("Trimmed String:"+s6.trim());
	
		//String Equals() method
		///equals() method compares the content of the string with the specified string and returns true if both strings are equal, otherwise it returns false. It is case sensitive.
		//equals() ,equalsIgnoreCase() , == operator
		//equalsIgnoreCase() method compares the content of the string with the specified string and returns true if both strings are equal, otherwise it returns false. It is not case sensitive.
		String s7= "Java selenium";
		String s8= "java selenium";
		System.out.println("Original String s7:"+s7);
		System.out.println("Original String s8:"+s8);
		//System.out.println("Equals:"+s7.equals(s8)); //true because both are referring to the same object in the string pool
		System.out.println("Equals:"+s7.equalsIgnoreCase(s8)); //true because both are referring to the same object in the string pool}
		
		//String Concat() method
		//concat() method concatenates the specified string to the end of the original string and returns the new string.
		String s9= " java";
		String s10= " selenium";
		System.out.println("Original String s9:"+s9);
		System.out.println("Original String s10:"+s10);
		System.out.println("Concatenated String:"+s9.concat(s10)); //true because both are referring to the same object in the string pool
		System.out.println("Concatenated String:"+s10.concat(s9).trim().length()); //true because both are referring to the same object in the string pool
		System.out.println("Concatenated String:"+s9.concat(s9).trim().length()); //true because both are referring to the same object in the string pool
		
		//String Empty() method
		//isEmpty() method checks whether the string is empty or not. It returns true if the string is empty, otherwise it returns false.
		String s11= " ";
		System.out.println("Original String s11:"+s11);
		System.out.println("Is Empty:"+s11.isEmpty()); //true
		*/
		//String contains() method
		//contains() method checks whether the string contains the specified sequence of characters or not. It returns true if the string contains the specified sequence of characters, otherwise it returns false.
		String s12= "java Selenium";
		System.out.println("Original String s12:"+s12);
		System.out.println("Contains:"+s12.contains("java")); //true
		System.out.println("Equals:"+s12.equals("java selenium")); //true
		System.out.println("EqualIgnoreCase:"+s12.equalsIgnoreCase("JAVA SELENIUM")); //true
	}
}
