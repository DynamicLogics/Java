package threads;

public class Concurrent_Method_Execution extends Thread {

	public static String nameA = " ";
	public static String nameB = " ";
	public static String nameC = " ";
	public static Concurrent_Method_Execution td = new Concurrent_Method_Execution();
	
	public Concurrent_Method_Execution() {
		
	}
	
	public void setAVal(String valA) {
		nameA = valA;
	}

	public void setBVal(String valB) {
		nameB = valB;
	}
	
	public String getAVal() {
		return nameA;
	}	

	public String getBVal() {
		return nameB;
	}
	
	public static void main(String[] args) {
		
		nameC = "Shubham";
		
		Thread t1 = new Thread() {
			public void run() {
				try {
					nameA = nameC;
					td.setAVal(nameA);
					System.out.println("A: "+nameA);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t2 = new Thread() {
			public void run() {
				try {
					nameB = nameC;
					td.setBVal(nameB);
					System.out.println("B: "+nameB);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		t2.start();
		t1.start();
		
		
		System.out.println("Final Val: "+td.getAVal()+" "+td.getBVal());
		
		
	}

}
