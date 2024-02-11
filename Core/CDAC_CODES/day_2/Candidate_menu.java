class Candidate_menu
{
	private int gymID;
	private String name;
	private int age;
	private int height;
	private int weight;
	private int weightIncreased=0;
	private int weightDecreased=0;

	
	public int getIncreasedWeight()
	{
		return weightIncreased;		
	}
	public int getDecreasedWeight()
	{
		return weightDecreased;		
	}

	public int getGymID()
	{
		return gymID;
	}
	public void updateHeight(int ht)
	{
		height = ht;		
	}
	public void updateWeight(int wt)
	{
		if(wt > weight )
			weightIncreased =1;
		if (wt<weight)
			weightDecreased = 1;
		weight = wt;
	}
	public void setInformation(int gymID,String name,int age,int height,int weight)
	{
		this.gymID = gymID;
		this.name =name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public void getInformation()
	{
		System.out.println("GymID : "+gymID);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Height : "+height);
		System.out.println("Weight : "+weight);		
	}
	public int getAge()
	{
		return age;
	}
}