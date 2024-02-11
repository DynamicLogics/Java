package Vector_1;

import java.io.Serializable;

public class Student_class implements Serializable
{
	private String name;
	private int rollno;
	
	
	public Student_class() 
	{
		
	}

	public Student_class(String name, int rollno)
	{
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setChange(String change)
	{
		this.name = change;
		
	}
	
	
	
	
}
