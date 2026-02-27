package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		/*
		int a=10,b=10,c=10,d=10,e=10;
		System.out.println("a+=20: "+(a+=20)); //a=30
		System.out.println("b-=20: "+(b-=20)); //b=-10
		System.out.println("c*=20: "+(c*=20)); //c=200
		System.out.println("d/=20: "+(d/=20)); //d=0
		System.out.println("e%=20: "+(e%=20)); //e=10
		
		//c=c*20; c=10*20; c=200
		/// */
		
		int a=10;  //Normal Variable:New values always replace the old values
		System.out.println("a+=20: "+(a+=20)); //a=a+20; a=10+20; a=30
		System.out.println("a-=20: "+(a-=20)); //a=a-20; a=30-20; a=10
		System.out.println("a*=20: "+(a*=20)); //a=200; a=a*20; a=10*20; a=200
		System.out.println("a/=20: "+(a/=20)); //a=10; a=a/20; a=200/20; a=10
		System.out.println("a%=20: "+(a%=20)); //a=10; a=a%20; a=10%20; a=10
		/*
* a+=20: 30
b-=20: -10
c*=20: 200
d/=20: 0
e%=20: 10
		 */
	}

}
