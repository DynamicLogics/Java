class Human
{
	private String name;
	private int age;
	private String gender;
	private long addharno;
	
	public Human(String name,int age,String gender,long addharno)
	{
		System.out.println("I'M IN HUMAN SUPER-CLASS");
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.addharno=addharno;
	}
	public void getHuman()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Addharno: "+addharno);
	}
}