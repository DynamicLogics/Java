package customExceptions;
//checked or compile time exception
public class DepositeException extends Throwable{
	
	/* Author: Shubham Ashtaputre
	 * 1] Exception extends Throwable
	 * 
	 * 2] Here we can extend our custom exception class with
	 * 	  Throwable or Exception class
	 * 	  Throwable - The Throwable class is the superclass of all errors
	 * 			   	  and exceptions in the Java language
	 * 	  Exception - The class Exception and its subclasses are a form of Throwable that 
	 			   	  indicates conditions that a reasonable application might want to catch
	 */
	
	public DepositeException(String exceptionMessage) {
		super(exceptionMessage);
	}
	
}
