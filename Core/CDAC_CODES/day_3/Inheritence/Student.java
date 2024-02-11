class Student extends Human
{
	String name;
	int rollno;
	int age;

	public void setStudentInfo(String na,int ro,long ad,String ge)
	{
		this.name=na;
		this.rollno=ro;
		this.addhar=ad;
		this.gender=ge;
	}
	public void getStudentInfo()
	{
	    System.out.println("Name: "+name);	
		System.out.println("Rollno: "+rollno);
		System.out.println("Addhar: "+addhar);
		System.out.println("Gender: "+gender);
	}
}
