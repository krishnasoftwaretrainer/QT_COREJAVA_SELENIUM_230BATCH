package loops;

public class Entry_Exit_Control {

	public static void main(String[] args)
	{
		//Entry control in for loop
		/*
		for(int i=11; i<=10; i++) //11<=10 false
		{
			System.out.println(i);
		} */
		
		//Entry control in while loop
		/*
		int i=11;
		while(i<=10) //11<=10 false
		{
			System.out.println(i);
			i++;
		}*/
		
		//Exit control in do-while loop
		int i=11;
		do 
		{
			System.out.println(i);
			i++;
		} while (i<=10); //11<=10 false
	}

}
