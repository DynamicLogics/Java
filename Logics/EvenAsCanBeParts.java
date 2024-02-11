package logics.code;

public class EvenAsCanBeParts {

	public static void main(String[] args) {
		
		
	    int[] arr = new int[6];
	    int remain = 20;
	    int partsLeft = 6;
	    for (int i = 0; partsLeft > 0; i++) {
	        int size = (remain + partsLeft - 1) / partsLeft; // rounded up, aka ceiling
	        System.out.println("size: "+size);
	        arr[i] = size;
	        remain -= size;
	        partsLeft--;
	    }
	    
	    
	    for(int i=0;i<=arr.length-1;i++) {
	    	
	    	System.out.println(arr[i]);
	    	
	    }
		
	}

}
