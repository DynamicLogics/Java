package code.yt;

public class CreateTable {
	//Author: Shubham Ashtaputre
	//Telegram Group: Java 🔥 Discussion Forum
	public static int counter = 1;
	
	public static void printTable(int number) {
		if(counter>10) {
			System.out.println("Table ended");
		}else {
			System.out.println(number+" * "+counter+" = "+(number*counter));
			++counter;
			printTable(number);
		}
	}
	
	public static void main(String[] args) {
		//printing the table of 2
		printTable(2);
	}

}
