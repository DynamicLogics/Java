package Assing;

public class Bank_Details
{
	String bank_name;
	String bank_type;
	int total_employees;
	int total_customers;
	
	public Bank_Details()
	{
		super();
	}

	public Bank_Details(String bank_name, String bank_type, int total_employees, int total_customers) 
	{
		super();
		this.bank_name = bank_name;
		this.bank_type = bank_type;
		this.total_employees = total_employees;
		this.total_customers = total_customers;
	}
	
	public String getBank_name() 
	{
		return bank_name;
	}
	public void setBank_name(String bank_name) 
	{
		this.bank_name = bank_name;
	}
	public String getBank_type() 
	{
		return bank_type;
	}
	public void setBank_type(String bank_type) 
	{
		this.bank_type = bank_type;
	}
	public int getTotal_employees() 
	{
		return total_employees;
	}
	public void setTotal_employees(int total_employees) 
	{
		this.total_employees = total_employees;
	}
	public int getTotal_customers() 
	{
		return total_customers;
	}
	public void setTotal_customers(int total_customers) 
	{
		this.total_customers = total_customers;
	}
}
