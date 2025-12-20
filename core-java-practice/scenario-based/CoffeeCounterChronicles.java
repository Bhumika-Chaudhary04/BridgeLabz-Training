package scenario_based;
import java.util.*;
public class CoffeeCounterChronicles {
	public static void main(String[] args) {
		
		//Scanner object
		Scanner sc=new Scanner(System.in);
		
		//infinite loop to serve multiple customers
		while(true) {
			System.out.print("Enter coffee type [mocha,latte,espresso,americano,flat-white] : ");
			String coffeeType=sc.next(); //user input
			if(coffeeType.equalsIgnoreCase("exit")) {
				System.out.println("Thankyou! Cafe Closed!");
				break;
			}
			System.out.print("Enter quantity : ");
			int quantity=sc.nextInt(); //user Input
			double price=0.0;
			
			//logic using switch-case statement
			switch(coffeeType.toLowerCase()) {
		    case "mocha":
		    	price=200;
		    	break;
		    case "latte":
		    	price=200;
		    	break;
		    case "espresso":
		    	price=300;
		    	break;
		    case "cappuccino":
		    	price=180;
		    	break;
		    case "americano":
		    	price=400;
		    	break;
		    case "flat-white":
		    	price=200;
		    	break;
		    	//default statement to handle invalid coffee input 
		    default:
		    	System.out.println("Invalid Coffee type!");
		    	continue; //skip current iteration
		    }
			
			//bill calculation
			double totalPrice=price*quantity; 
			double gst=totalPrice*0.1; //10 percent gst
			double finalBill=totalPrice+gst;
			
			//output
			System.out.println("Amount of 1 unit : "+price);
			System.out.println("Base Amount: " + totalPrice);
            System.out.println("GST (10%): " + gst);
            System.out.println("Total Bill: " + finalBill);
			
		}
		sc.close();			
	}
	
}
