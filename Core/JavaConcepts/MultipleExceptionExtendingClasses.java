package concepts.codes;
/*
    Aurthor: Shubham Ashtaputre
    Telegram: Programming Illuminated
*/
class New1{
	public static void val1() {
		try {
			int val = 2/0;
		}catch(Exception e) {
			System.out.println("A Excep");
		}
	}
}

class New2 extends New1{
	public static void val2() {
		try {
			val1();
			int val = 2/0;
		}catch(Exception e) {
			System.out.println("B Excep");
		}
	}
}

public class MultipleExceptionExtendingClasses extends New2{
	public static void val3() {
		try {
			val2();
			int val = 2/0;
		}catch(Exception e) {
			System.out.println("C Excep");
		}
	}
	
	public static void main(String[]args) {
		MultipleExceptionExtendingClasses n3 = new MultipleExceptionExtendingClasses();
		n3.val3();
	}
}

