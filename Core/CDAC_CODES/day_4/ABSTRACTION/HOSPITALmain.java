class HOSPITALmain
{
	public static void main(String args[])
	{
		System.out.println("==============================");

		
		METhospital m1=new METhospital();
		m1.treatment();
		m1.discharge();
		
		System.out.println("==============================");
		

		BIRLAhospital b1=new BIRLAhospital();
		b1.Insurance();
		b1.treatment();
		b1.discharge();
		
		System.out.println("==============================");

	}
}