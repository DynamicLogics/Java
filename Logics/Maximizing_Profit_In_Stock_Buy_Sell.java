package code;

import java.util.Arrays;
import java.util.List;

public class Maximizing_Profit_In_Stock_Buy_Sell {

	public static int buyPrice = 0;
	public static int sellPrice = 0;
	public static int totalProfit = 0;
	
	public static int maximumProfit(int[]stockPriceList) {
		
		for(int i=0;i<=stockPriceList.length-1;i++) {
			
			if(buyPrice==0) {
				//System.out.println("Initial Buy Price: "+buyPrice);
				buyPrice=stockPriceList[0];
			}
			
			if(i>0 && i+1<=stockPriceList.length-1 ) {
				
				if(stockPriceList[i]>stockPriceList[i+1] && stockPriceList[i]>stockPriceList[i-1]) {
					sellPrice = stockPriceList[i];
					//System.out.println("Profit: "+(sellPrice-buyPrice));
					totalProfit += (sellPrice-buyPrice);
				}
				if(stockPriceList[i]>stockPriceList[i+1]) {
					buyPrice = stockPriceList[i+1];
					//System.out.println("New Buy Price: "+buyPrice);
				}
				if(i+1>=stockPriceList.length-1 && stockPriceList[i]>stockPriceList[i-1]) {
					sellPrice = stockPriceList[i+1];
					//System.out.println("Profit: "+(sellPrice-buyPrice));
					totalProfit += (sellPrice-buyPrice);
				}
				
			}
			
		}
		
		return totalProfit;
	}
	
	
	public static void main(String[] args) {
		
		int stockPriceList[] = {50, 90, 130, 155, 20, 267, 347};
		
		System.out.println("Total Profit Earned: "+maximumProfit(stockPriceList));
		
	}

}
