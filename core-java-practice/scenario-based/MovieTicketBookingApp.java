package scenario_based;
import java.util.Scanner;
public class MovieTicketBookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Loop to handle multiple customers
        System.out.println("Enter number of customers : ");
        int n=sc.nextInt();
        for (int customer=1;customer<=n;customer++) {
            System.out.println("\n--------------------- Customer " + customer + " -------------------");
            // Taking movie genre input
            System.out.print("Enter movie type (Action / Thriller / Romantic): ");
            String movieType=sc.next();
            // Taking seat type input
            System.out.print("Enter seat type (gold / silver): ");
            String seatType = sc.next();
            // Taking snacks choice
            System.out.print("Do you want snacks? (yes / no): ");
            String snacks = sc.next();
            int ticketPrice = 0;
            // Switch to decide base price based on seat type
            switch (seatType.toLowerCase()) {
                case "gold":
                    ticketPrice = 300;
                    break;
                case "silver":
                    ticketPrice = 200;
                    break;
                default:
                    System.out.println("Invalid seat type entered!");
                    continue; // Skip to next customer
            }

            // If condition to add extra charge based on movie genre
            if (movieType.equalsIgnoreCase("action")) {
                ticketPrice += 100;
            } else if (movieType.equalsIgnoreCase("thriller")) {
                ticketPrice += 80;
            } else if (movieType.equalsIgnoreCase("romantic")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid movie type entered!");
                continue; // Skip to next customer
            }
            // If snacks are selected, add snack charge
            if (snacks.equalsIgnoreCase("yes")) {
                ticketPrice += 50;
            }
            // Display final ticket price
            System.out.println("Total Ticket Price: ₹" + ticketPrice);
        }
        System.out.println("\nThank you for booking tickets!");
    }
}
