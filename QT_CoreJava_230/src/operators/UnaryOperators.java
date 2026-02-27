package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// Unary +, Unary -, Increment(++) and Decrement(--)
		/*
		int a=10,b=10,c=10,d=10;
		a=6; b=7; c=8; d=9;
		//System.out.println("a: "+a); //10
		//System.out.println("b: "+b); //10
		//Pre Increment  //a=6,b=7,c=8,d=9
		System.out.println("++a: "+(++a)); //a=11 Print 7
		System.out.println("After Pre Increment: a: "+a); //11 update:7
		//Post Increment
		System.out.println("b++: "+(b++)); //a=11 Print 7
		System.out.println("After Post Increment: b: "+b); //11 update:8
		//Pre Decrement
		System.out.println("--c: "+(--c)); //c=9 print 7
		System.out.println("After Pre Decrement: c: "+c); //9 update:7
		//Post Decrement
		System.out.println("d--: "+(d--)); //d=10 print:9
		System.out.println("After Post Decrement: d: "+d); //9 update:8
		 */
		int a=10;  //Normal Variable:New values always replace the old values
		System.out.println("Starting value of a: "+a); //10
		System.out.println("++a: "+(++a)); //a=11 print 11 update:11
		System.out.println("after Pre Increment: a: "+a); //11 update:11
		System.out.println("a++: "+(a++)); //a=11 print 11
		System.out.println("after Post Increment: a: "+a); //12 update:12
		System.out.println("--a: "+(--a)); //a=11 print 11 update:11
		System.out.println("after Pre Decrement: a: "+a); //11 update:11
		System.out.println("a--: "+(a--)); //a=11 print 11
		System.out.println("after Post Decrement: a: "+a); //10 update:10
		System.out.println("Ending value of a: "+a); //10    
		 
		 
	
	}

}
