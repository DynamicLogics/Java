class Student extends Human
{
	String name;
	int rollno;
	int age;

	public void setStudentInfo(String na,int ro,long addhar,String gender)
	{
		this.name=na;
		setHuman (name,age,gender,addhar);
	}
	public void getStudentInfo()
	{
	    System.out.println("Name: "+name);	
		getHuman();
	}
}
