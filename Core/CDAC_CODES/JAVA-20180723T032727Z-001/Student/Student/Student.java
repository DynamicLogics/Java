interface AcademicDetails
{
	public void setCollegeName();
	public void setSubjectName();
	public void setCalculateResult();
}

class Student extends HumanBeing implements AcademicDetails
{


	 private String CollegeName;
	 private String CollegeAddress;
	 private String sub1;
	 private String sub2;
	 private String sub3;
	 private int mark1;
	 private int mark2;
	 private int mark3;
	 private int total;
	 private int add;
	 private double percentage;
	 private String result;

	public Student(String name,int age,int class_no,int addhar_no)
	{
		this.setName(name);
		this.setAge(age);
		this.setClass_no(class_no);
		this.setAddhar_no(addhar_no);
	}

	public void getStudent()
	{
		getStudent();
		getAge();
		getClass_no();
		getAddhar_no();
	}
	
	public void setCollegeName(String college,String Address)
	{
		this.CollegeName=college;
		this.CollegeAddress=Address;
	}
	
	public void setSubjectName(String s1,int s11,String s2,int s12,String s3,int s13)
	{
		this.sub1=s1;
		this.mark1=s11;
		this.sub1=s2;
		this.mark2=s12;
		this.sub1=s3;
		this.mark3=s13;
	}
	
	public void setCalculateResult(int to,double per,String res)
	{
		this.total=to;
		this.percentage=per;
		this.result=res;
	}
	
	public void getTotalMarks()
	{
		int add=mark1+mark2+mark3;
		System.out.println(add);
	}

	public void getPercentage()
	{
		int add=mark1+mark2+mark3;
		float per=(add/300)*100;
		System.out.println(per);
	}
	
	
	/*public void getStudent()
	{
		
		
		getName(name);
		getAge(age);
		getClass_no(class_no);
		getAddhar_no(addhar_no);

		System.out.println("Name:"+CollegeName);
		System.out.println("Name:"+CollegeAddress);
		System.out.println("Subject1:"+sub1);
		System.out.println("Subject1:"+mark1);
		System.out.println("Subject2:"+sub2);
		System.out.println("Subject1:"+mark2);
		System.out.println("Subject3:"+sub3);
		System.out.println("Subject1:"+mark3);
		System.out.println("Total:"+total);
		System.out.println("Percentage:"+percentage);
		System.out.println("Result:"+result);
	}*/
	
	}
	


