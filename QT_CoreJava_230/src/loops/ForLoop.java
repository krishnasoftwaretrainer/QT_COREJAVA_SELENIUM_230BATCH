package loops;

public class ForLoop {

	public static void main(String[] args) {
		//Print 1 to 10 numbers
		
		//Without Loop
		/*
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");  */
		
		//With Loop
		//for(InitialValue,Condition;Increment/Decrement)
        /* 
		for(int i=1;i<=10;i++) //1<=10T 10<=10T 11<=10F 
         {
        	// System.out.print(i+"  ");
        	// System.out.println(i);
        	 System.out.println(i+".Hello World");
         } */
         /*Explanation:
          * i=1; 1<=10T 
          * i=2; 2<=10T
          * i=3; 3<=10T
          * -------
          * 10; 10<=10T
          * i=11; 11<=10F
          * 
          * 1  2 3  4  5  6  7  8  9  10
          */
		//Print 10 to 1 numbers 10 9 8 7 6 5 4 3 2 1
		/*
		for(int i= 10;i>=1;i--)
		{
			//System.out.print(i+"  ");
			System.out.println(i);
		} */
		
		//Print 1 to 10 odd numbers 1 3 5 7
		/*
		for(int i=1;i<=50;i+=2) //i=i+2 1+2=3
		{
			System.out.println(i); //1 3 5 7 9
		} */
		
		//Print 1 to 10 even numbers 2 4 6 8
		for(int i=2;i<=50;i+=2) //i=i+2 2+2=4
		{
			System.out.println(i); //2 4 6 8 10
		}
		
	}

}
