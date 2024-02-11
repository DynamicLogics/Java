package Assing;

public class Q1Class 
{
	String nationality;
	String state;
	String bank_name;
	long addharcard_number;
	int deposite_amount;

	public Q1Class()
	{
		
	}
	
	public Q1Class(String nationality, String state, String bank_name, long addharcard_number,int deposite_amount) 
	{
		super();
		this.nationality = nationality;
		this.state = state;
		this.bank_name = bank_name;
		this.addharcard_number = addharcard_number;
		this.deposite_amount = deposite_amount;
	}

	public String getNationality() 
	{
		System.out.println("Nationality:"+nationality);
		return nationality;
	}

	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}

	public String getState() 
	{
		System.out.println("State:"+state);
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getBank_name() 
	{
		System.out.println("Bank Name:"+bank_name);
		return bank_name;
	}

	public void setBank_name(String bank_name)
	{
		this.bank_name = bank_name;
	}

	public long getAddharcard_number()
	{
		System.out.println("Addhar-Card Number:"+addharcard_number);
		return addharcard_number;
	}

	public void setAddharcard_number(long addharcard_number) 
	{
		this.addharcard_number = addharcard_number;
	}
	
	public int setDeposite_amount(int deposite_amount)
	{
		return deposite_amount;	
	}
	
	public int getDeposite_amount()
	{
		System.out.println("Amount Deposited:"+deposite_amount);
		return deposite_amount;
	}

}
