package logics.code;

public class StarDesignPattern {

	public static String starDesign = ""; 
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			starDesign+="*";
			if(i%2==0) {
				System.out.println(starDesign);
			}
		}

	}
}


