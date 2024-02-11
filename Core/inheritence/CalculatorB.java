package inheritence;

public class CalculatorB extends CalculatorA{
	
	public CalculatorB() {
		super();
		System.out.println("Inside CalculatorB Constructor");
	}
	
	public static String name(Object val) {
		System.out.println("Inside Object");
		return "";
	}
	
	public static void division() {
		System.out.println("Inside Division Method");
	}
	
	public static void multiplication() {
		System.out.println("Inside Multiplication Method");
	}
	
	
	public static void main(String[] args) {
		
		//able to access both parent and child methods
		CalculatorB calB = new CalculatorB();
		//calB.name(calB);
		
		//able to access both parent and child methods
		//CalculatorB calB = (CalculatorB) new CalculatorA();
		
		//It gives error
		//CalculatorB calB = new CalculatorA();
		
		//only able to access parents method not child class method
		/*
		CalculatorA calA = new CalculatorB();
		calA.addition();
		calA.substration();
		*/
		
	}
		
}
