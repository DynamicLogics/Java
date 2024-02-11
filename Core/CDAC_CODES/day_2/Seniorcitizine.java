class Seniorcitizine
	{
	private String name;
	private int age;
	private String gender;
	private long addhar;

public void setHuman(String n1,int a,String g,long adno)
{
	
	name=n1;
	age=a;
	gender=g;
	addhar=adno;
}
public void getHuman()
{
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Gender:"+gender);
	System.out.println("AddahrNumber:"+addhar);
}
public int getHuman_1() // as it returns age which is of integer type
{
	return age;
}
	
	}