package reflection;

public class Employee {
	
		//declared a private method
		private static void getEmployeeDetails() {
			System.out.println("Employee-Name: Shubham Ashtaputre"
								+"\n"
								+ "Employee-Department: Engineering");
		}
		
		private static void setNewEmployeeRecord(String employeeName, String department) {
			System.out.println("Employee-Name: "+employeeName
								+"\n"
								+ "Employee-Department: "+department);
		}
		
}
