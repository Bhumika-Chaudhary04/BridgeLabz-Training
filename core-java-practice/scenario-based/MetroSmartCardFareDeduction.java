package scenario_based;
import java.util.Scanner;
public class MetroSmartCardFareDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Delhi Metro Smart Card");
        System.out.println("-------------------------------------");
        //initial balance input 
        System.out.print("Enter your current Smart Card balance: ");
        int currentBalance = sc.nextInt();
        //loop until balance is exhausted or user quits
        while (currentBalance > 0) {
            System.out.println("\nCurrent Balance: " + currentBalance);
            System.out.print("Enter travel distance (in km) or -1 to exit: ");
            int distance = sc.nextInt();
            //exit condition
            if (distance == -1) {
                System.out.println("\nThank you for using Delhi Metro!");
                break;
            }
            //calculate fare using ternary operator.
            double fare=(distance<=5)?10:20;
            System.out.println("Calculated Fare: " + fare);
            //deduct from smart card balance.
            if (currentBalance >= fare) {
            	currentBalance -= fare;
                System.out.println("Fare deducted successfully !");
                System.out.println("Remaining Balance: " + currentBalance);
            } else {
                System.out.println("Insufficient balance !");
                System.out.println("Please recharge your Smart Card !");
                break;
            }
        }
        System.out.println("Final Balance: ₹" + currentBalance);
        System.out.println("\nJourney Ended...Have a safe travel !");
    }
}