class Static_courses
{
	private static String collegename="MET BKC";
	private String coursename;
	private int coursefees;
	
	public static void display()//This is a static member function,hence can called without object
	{
	    System.out.println("Here inside static...");	
	}
		public Static_courses(String coursename,int coursefees)
	{
		this.coursename=coursename;
		this.coursefees=coursefees;
	}
	public void getStatic_courses()
	{
		System.out.println(collegename);
		System.out.println(coursename);
		System.out.println(coursefees);
	}
}