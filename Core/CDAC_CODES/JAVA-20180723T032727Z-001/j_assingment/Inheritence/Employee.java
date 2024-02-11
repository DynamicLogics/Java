class Employee extends Human
{
	private String department;
	private String designation;
	
	public void setEmployee(String department,String designation,String name,int age,String gender,long addharno)
	{
		this.department=department;
		this.designation=designation;
		setHuman(name,age,gender,addharno);
	}
	public void getEmployee()
	{
		System.out.println("Department: "+department);
		System.out.println("Designation: "+designation);
		getHuman();
	}
	
}