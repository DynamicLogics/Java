package Threading_Example;

public class Bank_Application 

{
	private String name;
	private int amount;

	public Bank_Application (String na,int a)
	{
		this.name=na;
		this.amount=a;
	}
	
	public void getBank_Application()
	{
		System.out.println("BankName:"+name+"Balance"+amount);
		
	}
	
	public void withdraw(int am)
	{	
		if(amount>am)
		{
			amount =amount-am;
			
		}
		else
			System.out.println("Insufficient balance");
		
	}
	
	public void balance()
	{
		System.out.println("Current balance:"+name);
		System.out.println("Current balance:"+amount);
	}
}







