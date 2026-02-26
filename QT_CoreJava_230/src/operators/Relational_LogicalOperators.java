package operators;

public class Relational_LogicalOperators {

	public static void main(String[] args) {
		int a=20, b=10, c=40, d=30;
		
		System.out.println(a>b); //false  true 
		System.out.println(c>d); //false true 
		
		System.out.println((a>b) && (c>d)); //false true
		//System.out.println(false && true); //false
		System.out.println((a>b) || (c>d)); //true true
		//System.out.println(false || true); //false
	}

}
