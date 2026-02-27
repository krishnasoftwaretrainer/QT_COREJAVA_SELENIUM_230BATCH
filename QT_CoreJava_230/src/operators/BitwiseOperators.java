package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a=13,b=15;
		System.out.println(a&b); //10 & is a bitwise and operator
		//System.out.println(a&&b); //true && is a logical and operator
		System.out.println(a|b); //10 | is a bitwise or operator
		System.out.println(a^b); //10 ^ is a bitwise exclusive or operator
	
		/* 1=true, 0=false
		 * 5 in binary: 0101
		 * 8 in binary: 1000
		 * 5&8: 0000:0
		 * 5|8: 1101:13
		 * 5^8: 1101:13
		 * 13 in binary: 1101
		 * 15 in binary: 1111
		 * 13&15: 1101 & 1111: 1101:13
		 * 13|15: 1101 | 1111: 1111:15
		 * 13^15: 1101 ^ 1111: 0010:2
		 * 
		 */
	}

}
