package concepts.codes;

/*
	Author: Shubham Ashtaputre
	Telegram: @Programming_Illuminated	
*/

public class Singleton {
	
	public static Singleton singleObj = null;
	
	public static int num = 1;
	
	public static Singleton getClassObject() {
		if(singleObj==null) {
			singleObj = new Singleton();
			System.out.println("Object Formed");
		}else {
			System.out.println("Object Not Formed");
		}
		return singleObj;
	}
	
	public static void main(String[] args) {
		
		Singleton objA = Singleton.getClassObject();
		
		Singleton objB = Singleton.getClassObject();
		
		Singleton objC = Singleton.getClassObject();
		
		
		System.out.println(objA.hashCode()+" : "+objB.hashCode()+" : "+objC.hashCode());
		
		
	}

}
