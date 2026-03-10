package polymorphism;

public class RunTime_MethodOverRiding_Test 
{

	public static void main(String[] args) 
	{
	
		RunTime_MethodOverRiding_Parent_RBI rbi=new RunTime_MethodOverRiding_Parent_RBI();
		rbi.RateOfIntrest();
		System.out.println("======================");
		
		RunTime_MethodOverRiding_Child1_SBI sbi=new RunTime_MethodOverRiding_Child1_SBI();
		sbi.RateOfIntrest();
		System.out.println("=======================");
		
		RunTime_MethodOverRiding_Child2_HDFC hdfc=new RunTime_MethodOverRiding_Child2_HDFC();
		hdfc.RateOfIntrest();
		System.out.println("========================");
		
		RunTime_MethodOverRiding_Child3_ICICI icici=new RunTime_MethodOverRiding_Child3_ICICI();
		icici.RateOfIntrest();
		
	}
}
