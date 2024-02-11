package Threading_Example;

public class MainB

{
	public static void main(String args[])
	{
		Bank_Application SBI = new Bank_Application("SBI",5000);
		
		Atm_class a = new Atm_class("Bank Name:",SBI);
		
		SBI.balance();
	}
}
