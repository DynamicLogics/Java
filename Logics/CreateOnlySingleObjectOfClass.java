package logics.code;

/*
   Author: Shubham Ashtaputre
   Telegram Group: Java 🔥 Discussion Forum
	
 * Write a code to create an class from which only an single object can be created 
 * and if new object is created for same class then throw error.
 */

public class CreateOnlySingleObjectOfClass {
	
	public static CreateOnlySingleObjectOfClass singleObj = null;
	
	public static int num = 1;
	
	public static CreateOnlySingleObjectOfClass getClassObject() throws Exception {
		if(singleObj==null) {
			singleObj = new CreateOnlySingleObjectOfClass();
			System.out.println("Object Formed");
		}else {
			throw new Exception();
		}
		return singleObj;
	}
	
	public static void main(String[] args) throws Exception {
		
		CreateOnlySingleObjectOfClass objA = CreateOnlySingleObjectOfClass.getClassObject();
		
		CreateOnlySingleObjectOfClass objB = CreateOnlySingleObjectOfClass.getClassObject();
		
		CreateOnlySingleObjectOfClass objC = CreateOnlySingleObjectOfClass.getClassObject();
		
		
		System.out.println(objA.hashCode()+" : "+objB.hashCode()+" : "+objC.hashCode());
		
		
	}

}