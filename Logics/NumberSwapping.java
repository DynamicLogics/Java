package logics.code;

public class NumberSwapping {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = "defg";
		
		a+=b;
		
		for(int i=0;i<=a.length()-1;i++) {
			
			if(i<=b.length()-1) {
				if(a.charAt(i)!=b.charAt(i)) {	
					b+=a.charAt(i);
					System.out.println(a.charAt(i));
				}
			}
			
		}
		
		System.out.println(a+" : "+b);		
		
	}

}
