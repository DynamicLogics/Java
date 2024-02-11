package code;

import java.util.Random;

public class RandomIdGenerator {

	public static void main(String[] args) {
		
		Random random = new Random();
	    long random63BitLong = random.nextLong() & 0x3FFFFFFFFFFFFFFFL;
	    long variant3BitFlag = 0x8000000000000000L;
	    System.out.println( random63BitLong );
		
		//random63BitLong | variant3BitFlag
		
	}

}
