class Army
{
	private String name;
	private int age;
	private String country;
	private int height;
	private int weight;
	private int date;
	private int exam_result;
	int physical_test;
	
	public void setName(String na)
	{
		name=na;
	}
	public void setAge(int ag)
	{
		age=ag;
		//return 0;
	}
	public void setCountry(String co)
	{
		country=co;
	}
	public void setHeight(int he)
	{
		height=he;
		//return he;
	}
	public void setWeight(int we)
	{
		weight=we;
		//return 0;
	}
	public void setDate(int da)
	{
		date=da;
		//return 0;
	}
	public void setExam_result(int ex)
	{
		exam_result=ex;
		
	}
	public void setPhysical_test(int ph)
	{
		physical_test=ph;
		
	}
	
	
	public void getName()
	{
		System.out.println("===============================");
		System.out.println("Name:"+name);
	}
	public int getAge()
	{
		System.out.println("Age:"+age);
		return age;	
	}
	public void getCountry()
	{
		System.out.println("Country:"+country);
	
	}
	public int getHeight()
	{
			System.out.println("Height:"+height);
			return 0;
	}
	public int getWeight()
	{
		System.out.println("Weight:"+weight);
		return 0;
		
	}
	public int getDate()
	{
		System.out.println("Date:"+date);
		return 0;
	}
	public int getExam_result()
	{
		System.out.println("Exam Result:"+exam_result);
		return 0;
	}
	public int getPhysical_test()
	{
		System.out.println("Physical Test Result:"+physical_test);
		return 0;
	}
	
	public void getInformation()
	{
	 System.out.println(age);
	 System.out.println(country);
	 System.out.println(weight);
	 System.out.println(date);
	 System.out.println(exam_result);
	 System.out.println(physical_test);
	}
}