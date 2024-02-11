 interface university
 {
	 void calculateResult();
 }
  
 class Student implements university
{
		int rollno;
		
		public void setInfo()
		{
			System.out.println("Inside setInfo of student");
		}
		public void getInfo()
		{
			System.out.println("Inside getInfo of student");
		}
		public void calculateResult()
		{
			System.out.println("Inside calculate result.....");
		}
}

class DynamicDispatch
{
	public static void main(String args[])
	{
		Student s1=new Student();
		university u;//=new university object of interface cannot be created and 'u' is object but it's not initiased
		u=s1;
		u.calculateResult();
		//u.setInfo();//it is only possible if it's an interface function not the member function of Student
		//u.getInfo();
	}
}










