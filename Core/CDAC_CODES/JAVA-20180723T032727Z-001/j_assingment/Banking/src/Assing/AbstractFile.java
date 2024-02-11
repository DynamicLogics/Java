package Assing;

public class AbstractFile extends FD
{
	int deposite_amount;
	double rate_of_interst;
	int period;
	
	 

public AbstractFile(int deposite_amount,double rate_of_interst, int period) 
{
		super();
		this.deposite_amount = deposite_amount;
		this.rate_of_interst = rate_of_interst;
		this.period = period;
}

	
public double getRate_of_interst() 
{
		System.out.println("Rate of interest: "+rate_of_interst);
		return rate_of_interst;
	}


	public void setRate_of_interst(double rate_of_interst) 
	{
		this.rate_of_interst = rate_of_interst;
	}


	public int getPeriod()
	{
		return period;
	}


	public void setPeriod(int period)
	{
		System.out.println("Time Period: "+period);
		this.period = period;
	}



@Override
public void fd(int deposite_amount, double rate_of_interst, int period) 
{
	//System.out.println("===================================================");
	System.out.println("Fixed deposite is complusary period:"+period+"years");
	System.out.println("Rate of interest available for FD ="+rate_of_interst+" p.c.p.a");
	double si = (deposite_amount*rate_of_interst*period)/100;
	double n = si+deposite_amount;
	System.out.println("Amount received after period of 2 years: "+n);
	System.out.println("===================================================");
}

}
