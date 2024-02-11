package Assing;

public class Q1ClassSub extends Q1Class
{
	float todays_date;
	String name;
	int age;
	String occupation;
	long yearly_income;
	
	public Q1ClassSub() 
	{
		super();
	}

	public Q1ClassSub(String nationality, String state, String bank_name, long addharcard_number,int deposite_amount,float todays_date, String name, int age, String occupation, long yearly_income) 
	{
		super();
		this.nationality = nationality;
		this.state = state;
		this.bank_name = bank_name;
		this.addharcard_number = addharcard_number;
		this.deposite_amount = deposite_amount;
		this.todays_date = todays_date;
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.yearly_income = yearly_income;
	}

	public float getTodays_date()
	{
		System.out.println("Todays Date:"+todays_date);
		return todays_date;
	}

	public void setTodays_date(float todays_date)
	{
		this.todays_date = todays_date;
	}

	public String getName()
	{
		System.out.println("Name:"+name);
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		System.out.println("Age:"+age);
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getOccupation() 
	{
		System.out.println("Occupation"+occupation);
		return occupation;
	}

	public void setOccupation(String occupation) 
	{
		this.occupation = occupation;
	}

	public long getYearly_income() 
	{
		System.out.println("Yearly Income:"+yearly_income);
		return yearly_income;
	}

	public void setYearly_income(long yearly_income)
	{
		this.yearly_income = yearly_income;
	}	
	
}
