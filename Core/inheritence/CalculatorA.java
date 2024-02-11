package inheritence;

public class CalculatorA {
	
	public CalculatorA() {
		System.out.println("Inside CalculatorA Constructor");
	}
	
	public static void addition() {
		System.out.println("Inside Addition Method");
	}
	
	public static void substration() {
		System.out.println("Inside substration Method");
	}
	
	public static String name(String val) {
		System.out.println("Inside String");
		return val;
	}
	
	/*public static Object name(Object val) {
		System.out.println("Inside Object");
		return val;
	}*/
	
	public static void cal(int val, float val2) {
		System.out.println("Inside Int");
		//return val;
	}
	
	public static void cal(float val3, int val2) {
		System.out.println("Inside Float");
		//return val;
	}
	
	/*public static void main(String[] args) {
		
		System.out.println(name(null));
		
		//System.out.println(cal(1,2));
		
	}*/
	
	
}
