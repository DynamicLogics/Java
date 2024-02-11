import java.out.*;

class Main_1
{
	Student obj1=new Student();
Scanner scan=new Scan(System.in);
Student obj[]=new Student[1];
int count=0;
int choice; 

	while(choice!=4)
	{
for(int i=0;i<obj.length;i++)
{

	System.out.println("1-> Enter Student Details");
	System.out.println("2-> Display Result");
	System.out.println("3-> Exit");

	
	switch(choice)
	{
		case 1:	obj[count]=new Student();

				System.out.println("Enter College name");
				String CollegeName=scan.next();
			   
				System.out.println("Enter College address");
				String CollegeAdrress=scan.next();
			   
		
				System.out.println("Enter Student Name");
				String name=scan.next();
			   
			   System.out.println("Enter Student Age");
		       int age=Integer.parseInt(scan.next());
			   
			   System.out.println("Enter Student Class");
		       int class_no=Integer.parseInt(scan.next());
			   
			   System.out.println("Enter Student Addhar Number");
		       String addhar_no=Long.parseLong(scan.next());
			   
			   System.out.println("Enter Subject1 name");
		       String sub1=scan.next();
			   
			   
			   System.out.println("Enter Subject2 name");
		       String sub2=scan.next();
			   
			   
			   System.out.println("Enter Subject3 name");
		       String sub3=scan.next();
			   
			   System.out.println("Enter"+sub1+"marks");
		       int mark1=Integer.parseInt(scan.next());
			   
			   System.out.println("Enter"+sub2+"marks");
		       int mark2=Integer.parseInt(scan.next());
			   
			   System.out.println("Enter"+sub3+"marks");
		       int mark3=Integer.parseInt(scan.next());
			   
			   obj1.setStudent(name,age,class_no,addhar_no);
			   obj1.setSubjectName(sub1,mark1,sub2,mark2,sub3,mark3);
			  
		case 2:
				System.out.println("Following are the student details");
				obj1.getStudent();
			  
		case 3:
				System.out.println("Total marks are")
				obj1.getTotalMarks();
				System.out.println("Percentage Obtained are:")
				obj1.getPercentage();
	}
}	
	
	}
}
