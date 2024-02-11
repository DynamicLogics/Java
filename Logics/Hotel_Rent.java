package code;

public class Hotel_Rent {

	public static int extraCharges = 0;
	   public static int counter = 0;
	    
	    public static int calculatePrice(int adults, int childrens){
	        
	        for(int i=0;i<=adults;i++){
	            if(i>2){
	               extraCharges = extraCharges+200;
	            }else{
	                if(counter==0){
	                    extraCharges = extraCharges+1000;
	                    counter = counter+1;
	                }
	            }        
	        }
	        
	        for(int i=0;i<=childrens;i++){
	            extraCharges = extraCharges+100;
	        }
			
	        extraCharges = extraCharges-100;
	        counter = 0;
	        return extraCharges;
	        
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(calculatePrice(3,1));    
	    }

}
