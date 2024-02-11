
//see ObjectOutputStram_1 for it's output

package FileHandling;

import java.io.Serializable;

public class BankApp implements Serializable
{
	String name;
	int amount;
	
	public BankApp() 
	{
		super();
	}
	
	public BankApp(String name, int amount)
	{
		super();
		this.name = name;
		this.amount = amount;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAmount() 
	{
		return amount;
	}

	public void setAmount(int amount) 
	{
		this.amount = amount;
	}
	
	
	
}
