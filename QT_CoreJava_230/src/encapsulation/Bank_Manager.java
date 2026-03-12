package encapsulation;

public class Bank_Manager {
	public static void main(String[] args) 
	{
		Bank_Customer cust=new Bank_Customer();
		cust.setAccnum(12345); //1235 to 12345
		cust.setAccname("N.Krishna"); //Krishna to N.Krishna
		cust.setBalance(5000); //3k to 5k
		int myaccnum=cust.getAccnum();
		String myaccname=cust.getAccname();
		double mybal=cust.getBalance();
		
		System.out.println("AccNum:"+myaccnum);
		System.out.println("Acc Name:"+myaccname);
		System.out.println("Balance:"+mybal);
	}

}
