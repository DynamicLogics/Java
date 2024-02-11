import java.util.*;
import java.awt.Desktop;
import java.net.URI;
class Army_1
{
public static void main(String args[]) throws Exception
{
	Scanner scan=new Scanner(System.in);
	int Objectcount =0;//this count is taken b'coz if down i took 100 size array but used only first 6 index of array to store the data then the remaining 96 columns will be null and will display null pointer error but 
	                   // but when i took object counter the loop will only go till the 6 array columns and will ignore 94 blank columns 
					   //thus we will be able to see the result till first 6 index of array
					   //and always initialize object array to 0
	Army objarr[]=new Army[100];//blank column structure in arrray
	int g=0;
	while(g!=6)
	{
		System.out.println("1->Apply for position");
		System.out.println("2->See the details of all candidates");
		System.out.println("3->Enter test marks");
		System.out.println("4->Check test result");
		System.out.println("5->Upload the documents");
		System.out.println("6->Exit");
		g=Integer.parseInt(scan.next());
		switch(g)
		{
		case 1:	
				objarr[Objectcount]=new Army();//creating object of array
				System.out.println("Apply for position");
				//System.out.println("Enter todays date:");
				//int da=Integer.parseInt(scan.next());
		        System.out.println("Enter your name:");
				String na=scan.next();
				
				System.out.println("Enter your age");
				int ag=Integer.parseInt(scan.next());
				System.out.println("Enter your height");
				int he=Integer.parseInt(scan.next());
				System.out.println("Enter your weight");
				int we=Integer.parseInt(scan.next());
				System.out.println("Enter your country");
				String co=scan.next();
				
				objarr[Objectcount].setName(na);
				objarr[Objectcount].setAge(ag);
				objarr[Objectcount].setCountry(co);
				objarr[Objectcount].setWeight(we);
				//objarr[Objectcount].setDate(da);
				objarr[Objectcount].setHeight(he);
				
				if(objarr[Objectcount].getAge()<18 || objarr[Objectcount].getAge()>35 )
				{
					System.out.println("Your age exceeds the limit of selection process");
				
				if(objarr[Objectcount].getHeight()<6)
				{
					System.out.println("Your height exceeds the limit of selection process");
					
				if(objarr[Objectcount].getWeight()<65 || objarr[Objectcount].getWeight()>75)
				{
					System.out.println("Your weight exceeds the limit of selection process");
								
				}}}
				/*else
				{
				objarr[Objectcount].getName();
				objarr[Objectcount].getAge();	
				//objarr[Objectcount].getDate();
				objarr[Objectcount].getCountry();
				objarr[Objectcount].getHeight();
				objarr[Objectcount].getWeight();
				}	*/
				else{
				Objectcount++;}				
				break;
		
		case 2:	System.out.println("See the details of all cadidates");
				for(int i=0;i<Objectcount;i++)
				{
				//objarr[i].getInformation();
				objarr[i].getName();
				objarr[i].getAge();	
				//objarr[Objectcount].getDate();
				objarr[i].getHeight();
				objarr[i].getWeight();
				objarr[i].getCountry();
				}
				break;
	
        case 3:	System.out.println("Enter the test marks:");
				
				System.out.println("Written exam marks");
				int ex=Integer.parseInt(scan.next());
				System.out.println("Physical test marks:");
				int ph=Integer.parseInt(scan.next());
				for(int k=0;k<Objectcount;k++)
				{
				objarr[k].setExam_result(ex);
				objarr[k].setPhysical_test(ph);
				}
				break;
	
		case 4:	System.out.println("Written exam result:");
				for(int o=0;o<Objectcount;o++)
				{
					objarr[o].getExam_result();
					objarr[o].getPhysical_test();
				}
				break;
			
		case 5:	Desktop desktop=Desktop.getDesktop();
		        desktop.browse(new URI("https://imgbb.com/"));
				break;
		
		}
	}
}
}
	
