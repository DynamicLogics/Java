package hash.code_equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {

	public int id;
	public String name;
	public float salary;
	public String department;
	
	public Employee() {
	}
	
	public Employee(int id, String name, float salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(department, id, name, salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	
	public static void main(String[] args) {
		
		Employee empA = new Employee(); 
		
		Employee empB = new Employee(); 
		
		empA.setId(1000);
		empB.setId(1000);
		
		System.out.println("comparing empA and empB object: "+empA.equals(empB));
		
		System.out.println("empA hashcode: "+empA.hashCode());
		System.out.println("empB hashcode: "+empB.hashCode());
		
		Set<Employee> empObj = new HashSet<>();
		empObj.add(empA);
		empObj.add(empB);
		
		System.out.println("empobj: "+empObj);
		
		
	}

}









