package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean a=true, b=true;
		 a=true; b=false;
		 a=false; b=true;
		a=false; b=false;
		
		System.out.println("a&&b: "+(a&&b)); //true false false false
		System.out.println("a||b: "+(a||b)); //true true true false
		System.out.println("!a: "+(!a));     //false false true true
		System.out.println("!b: "+(!b));	 //false true false true
		System.out.println("!(a&&b): "+!(a&&b));
	}

}
