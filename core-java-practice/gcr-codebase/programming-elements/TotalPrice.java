import java.util.*;
public class TotalPrice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter unit price ");
		double unitPrice=sc.nextDouble(); //user input
		System.out.print("Enter quantity ");
		double quantity=sc.nextDouble(); //user input
		
		double price=quantity*unitPrice; //price calculation
		System.out.printf("The total purchase price is INR %.4f if the quantity %.4f and unit price is INR %.4f",price,quantity,unitPrice);
	}
	
	

}
