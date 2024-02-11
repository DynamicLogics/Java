package Assing;
import java.util.*;

import java.util.*;

public class Q1Main 
{

	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("******Welcome To SBI Bank********");
		
		Q1ClassSub obj[] = new Q1ClassSub[100];
		
		AbstractFile obj1[] = new AbstractFile[100];/////////////
		
		Bank_Details obj2[] = new Bank_Details[100];
		
		int choice  = 0;
		int count = 0;
		while(choice!=5)
		{
		System.out.println("1.Enter Bank Details");
		System.out.println("2.To See Customers Details");
		System.out.println("3.To open an FD account");
		System.out.println("4.To See the rate of interest and time period");
		System.out.println("5.Exit");
		choice = Integer.parseInt(scan.next());

		switch(choice)
		{
		
		case 1:
			
		System.out.println("Enter Bank Name:");
		String bank_name  = scan.next();
		
		System.out.println("Enter Bank Type:");
		String bank_type  = scan.next();
		
		System.out.println("Enter Total Employess:");
		int total_employees  = Integer.parseInt(scan.next());
		
		System.out.println("Enter Total Customers:");
		int total_customers  = Integer.parseInt(scan.next());
	
		System.out.println("Enter rate of interest");
		double rate_of_interst = Double.parseDouble(scan.next());

		break;
		
		case 2:for(int k=0;k<count;k++)
		{
		System.out.println("========================================");
		 obj[k].getAge();
		 obj[k].getNationality();
		 obj[k].getAddharcard_number();
		 obj[k].getDeposite_amount();
		 obj[k].getState();
		 obj[k].getAge();
		 obj[k].getName();
		 obj[k].getOccupation();
		 obj[k].getYearly_income();
		 System.out.println("========================================");
		}
		
		break;
		
		
		case 3:
			obj[count] = new Q1ClassSub();
			
			System.out.println("Enter Nationality:");
			String nationality1  = scan.next();
			
			System.out.println("Enter Bank Name:");
			String bank_name1 = scan.next();
			
			System.out.println("Enter State:");
			String state1  = scan.next();
			
			System.out.println("Enter Addhar-Card_Number:");
			long addharcard_number1  = Long.parseLong(scan.next());
			if(addharcard_number1<=0)
			{
				System.out.println("Addhar Card number is mandatory for opening the account");
				break;
			}

			System.out.println("Enter Amount to be Deposited:");
			int deposite_amount1  = Integer.parseInt(scan.next());
			if(deposite_amount1<=1000)
			{
				System.out.println("Minimum amount to be deposited is rupees 1000/-");
				break;
			}
			
			System.out.println("Enter Todays Date:");
			float todays_date1  = Float.parseFloat(scan.next());
			
			System.out.println("Enter Your Name:");
			String name1  = scan.next();
			
			System.out.println("Enter Your Age:");
			int age1  = Integer.parseInt(scan.next());
			
			System.out.println("Enter Your Occupation:");
			String occupation1  = scan.next();
			
			System.out.println("Enter Your Yearly Income:");
			int yearly_income1  = Integer.parseInt(scan.next());
			
			System.out.println("Enter rate of interest");
			double rate_of_interst1 = Double.parseDouble(scan.next());
			
			System.out.println("Enter rate of time period");
			int period1 = Integer.parseInt(scan.next());
			
			AbstractFile f11 = new AbstractFile(deposite_amount1,rate_of_interst1,period1);
			
			Q1ClassSub q11 = new Q1ClassSub(nationality1,bank_name1,state1,addharcard_number1,deposite_amount1,todays_date1,name1,age1,occupation1,yearly_income1);
			
			obj[count] = q11;
			obj1[count]=f11;
			
			count++;
			
			break;
			
		case 4:	for(int d=0;d<count;d++)
				{
				 // obj1[d].getRate_of_interst();
				  //obj1[d].getPeriod();
				  //obj[d].getDeposite_amount();
					System.out.println("=====================================");
			        System.out.println("Customers Name:"+obj[d].getName());
			        obj1[d].fd(deposite_amount1=obj[d].getDeposite_amount(), rate_of_interst1=obj1[d].getRate_of_interst(),period1=obj1[d].getPeriod());
				}	
		
		break;
		
		}//switch
		}//while

		
	
	}




}
