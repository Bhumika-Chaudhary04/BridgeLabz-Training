
public class ProfitLoss {
	public static void main(String[] args) {
		int costPrice=129;
		int sellingPrice=191;
//		since sellingPrice is greater than costPrice we will calculate profit
		int profit=sellingPrice-costPrice;
//		profitPercentage is (profit/costPrice)*100
		double profitPercentage=(profit*100)/costPrice;
		System.out.println("The cost price is INR "+costPrice+ " and Seling Price is INR "+sellingPrice);
		System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
		
	}

}
