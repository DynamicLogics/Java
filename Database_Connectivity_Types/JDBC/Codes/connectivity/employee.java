package allFiles;

public class employee 
{
	int empno;
	String ename;
	int salary;
	String department;

	public employee() 
	{
		super();
	}

	public employee(int empno, String ename, int salary, String department)
	{
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public int getEmpno()
	{
		return empno;
	}

	public void setEmpno(int empno) 
	{
		this.empno = empno;
	}

	public String getEname() 
	{
		return ename;
	}

	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

}
