class Manager extends Employee
{
	int HRA;
	int basic;
	int TA;
	int bonus;
	int increment;
	
	 public void setManager(int HRA,int basic,int TA,int bonus,int increment,String department,String designation,String name,int age,String gender,long addharno)
	{
		this.HRA=HRA;
		this.basic=basic;
		this.TA=TA;
		this.bonus=bonus;
		this.increment=increment;
		setEmployee(department,designation,name,age,gender,addharno);
	}
	public void getManager()
	{
		System.out.println("HRA: "+HRA);
		System.out.println("Basic: "+basic);
		System.out.println("TA: "+TA);
		System.out.println("Bonus: "+bonus);
		System.out.println("Increment: "+increment);
		getEmployee();
	}
}
