package logics.code;

public class LogicMonitorChallenge_1 {
	
	
	//class Challenge {
		  
		  public static String findSpecificCharacters = null;
		  
		  public static String getMiddle( String str ) {
		    
		    int stringLength = str.length();
		    
		    if(stringLength%2==0){
		      //System.out.println("even name "+str);
		      int charNumber = stringLength/2;
		      findSpecificCharacters = Character.toString(str.charAt(charNumber-1))+Character.toString(str.charAt(charNumber));
		      return findSpecificCharacters;
		    }else{
		       //System.out.println("odd name"+ str);
		       int charNumber = stringLength/2;
		       //System.out.println(str.charAt(charNumber));
		      findSpecificCharacters = Character.toString(str.charAt(charNumber));
		      return findSpecificCharacters;
		    }    
		  }
		//}
	
	
}
