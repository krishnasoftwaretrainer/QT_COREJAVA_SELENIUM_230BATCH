package encapsulation;

//Same package and Same class
public class Bank_Customer 
{
	private int accnum=1235; //12345
	private String accname="Krishna";//N.Krishna
	private double balance=3000;  //get:3k set:5k 
	
	int a=10;
	
	//Getter and Setter Methods
	public int getAccnum()
	{
		return accnum;
	}
	
	public String getAccname() 
	{
		return accname;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void setAccnum(int accnum) 
	{
		this.accnum = accnum;
	}
	
	public void setAccname(String accname) 
	{
		this.accname = accname;
	}
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

}
