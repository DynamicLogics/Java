package concepts.codes;

/*
Author: Shubham Ashtaputre
*/

@FunctionalInterface
interface GetSquareNumber{
	
	public int getSquare(int x);
	
}

public class Lambda {

	public static void main(String[] args) {
		
		GetSquareNumber sqNum = (x)->{return x*x;};
		
		System.out.println(sqNum.getSquare(2));
		
	}

}
