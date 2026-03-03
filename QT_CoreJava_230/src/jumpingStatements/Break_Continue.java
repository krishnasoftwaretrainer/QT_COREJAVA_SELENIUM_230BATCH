package jumpingStatements;

public class Break_Continue {

	public static void main(String[] args) {

		for(int i=1;i<=20;i++)//1<=10 2<=10..5<=5 6<=10T 
		{
			if(i==10) //1==5 F 2==5F.. 5==5T 6==5F 7==5F 8==5F 9==5F 10==5F
			{
				//break;  //Stop
				continue;
			}
			System.out.println(i);
		}
	}

}
