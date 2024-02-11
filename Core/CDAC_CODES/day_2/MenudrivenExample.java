import java.util.*;
class MenudrivenExample
{
	public static void main(String args[])
	{
		int choice=0;
		int gymCount = 0;
		Scanner scan = new Scanner(System.in);
		Candidate objarry[] = new Candidate[20];
		
		while(choice!=8)
		{
			System.out.println("1. Enrollment ");
			System.out.println("2. Update Height ");
			System.out.println("3. Update Weight");
			System.out.println("4. List All  Candidates ");
			System.out.println("5. List Candidates whoes weight has decreased");
			System.out.println("6. List Candidates whoes weight has increased");
			System.out.println("8. Exit ");
			System.out.println("Enter your choice... ");
			choice = Integer.parseInt(scan.next());			
			switch(choice)
			{
				case 1:
					objarry[gymCount] = new Candidate();
					System.out.println("Enter Name..");
					String name = scan.next();

					System.out.println("Enter Age..");
					int age = Integer.parseInt(scan.next());
					
					System.out.println("Enter Height..");
					int height= Integer.parseInt(scan.next());
					
					System.out.println("Enter Weight..");
					int weight = Integer.parseInt(scan.next());
					
	objarry[gymCount].setInformation(gymCount+1,name,age,height,weight);
	gymCount++;
	break;

	case 4:
		for(int i=0;i<gymCount;i++)
			objarry[i].getInformation();
	break;
	case 2:
		System.out.println("Enter the GymID");
		int id = Integer.parseInt(scan.next());
		System.out.println("Enter the height");
		int ht = Integer.parseInt(scan.next());					
		for(int i=0;i<gymCount;i++)
		{
			if(objarry[i].getGymID() == id)
			{
				objarry[i].updateHeight(ht);
			}

		}

	break;	
	case 3:
		System.out.println("Enter the GymID");
		id = Integer.parseInt(scan.next());
		System.out.println("Enter the weight");
		int wt = Integer.parseInt(scan.next());					
		for(int i=0;i<gymCount;i++)
		{
			if(objarry[i].getGymID() == id)
			{
				objarry[i].updateWeight(wt);
			}

		}

	break;							
	case 5:
		for(int i=0;i<gymCount;i++)
		{
			if(objarry[i].getDecreasedWeight() > 0)
			{	
				objarry[i].getInformation();
			}
		}
	break;
	case 6:
		for(int i=0;i<gymCount;i++)
		{
			if(objarry[i].getIncreasedWeight() > 0)
			{	
				objarry[i].getInformation();
			}
		}
	break;


		
			}
		}

	}
}