package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Access_Private_Method {
	//Author: Shubham Ashtaputre
	public static void main(String[] args) {
		//accessing private method using Java Reflection
		try {

				//setting the class name which private method you want to access
				Class getClass = Class.forName("reflection.Employee");
				//creating object of that class
				Object getObject = getClass.newInstance();

				//ACCESS THE PRIVATE VOID METHOD////////////////////////////////////////////
				//setting the private method name that you want to access
				Method getEmployeeDetailsMethod = getClass.getDeclaredMethod("getEmployeeDetails", null);
				//setting the private method access permission to TRUE
				getEmployeeDetailsMethod.setAccessible(true);
				//Invoking the private method
				getEmployeeDetailsMethod.invoke(getObject, null);
				
				//ACCESS THE PRIVATE PARAMETERISED METHOD////////////////////////////////////////////
				//creating array to datatype of parameters that private method is accepting
				Class[] parametersClass = {String.class,String.class};
				//creating array to parameters that we need to pass as arguments to private method
				String[] setEmployeeRecord = {"Shubham Ashtaputre","Production Engineering"};
				//setting the private method name that you want to access
				Method setNewEmployeeRecordMethod = 
				getClass.getDeclaredMethod("setNewEmployeeRecord", parametersClass);
				//setting the private method access permission to TRUE
				setNewEmployeeRecordMethod.setAccessible(true);
				//Invoking the private method
				setNewEmployeeRecordMethod.invoke(getObject,setEmployeeRecord);
				
		} catch (ClassNotFoundException |InstantiationException 
				 | IllegalAccessException | NoSuchMethodException 
				 | SecurityException | IllegalArgumentException 
				 | InvocationTargetException exception) {
				exception.printStackTrace();
		}
	}

}
