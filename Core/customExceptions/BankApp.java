package customExceptions;

public class BankApp {
	
	public static void minimumDeposite(int amount) throws DepositeException {
		if(amount<2000) {
			 // throw an object of user defined exception
			throw new DepositeException("please deposite minimum amount of 2000 rupees");
		}else {
			System.out.println("deposite successfull");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			minimumDeposite(1000);
		} catch (DepositeException e) {
			e.printStackTrace();
		}

	}

}
