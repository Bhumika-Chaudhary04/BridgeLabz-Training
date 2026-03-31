package scenario_based;
import java.util.Scanner;
public class RohansLibraryReminderApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Loop to calculate fine for 5 books
        System.out.println("--------------------Fine Calculator-------------------");
        int totalFine=0;
        for (int book=1;book<=5;book++) {
            System.out.println("\n----------------- Book " + book + " ----------------");
            // Taking due date input (day number)
            System.out.print("Enter due date (day): ");
            int dueDate=sc.nextInt();
            System.out.print("Enter return date (day): ");
            int returnDate=sc.nextInt();
            if (returnDate>dueDate) {
                int lateDays=returnDate-dueDate;
                int fine=lateDays*5;
                totalFine+=fine;
                System.out.println("Returned late by " + lateDays + " days");
                System.out.println("Fine to be paid: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("\n\nTotal fine for 5 books : "+totalFine);
        System.out.println("\nAll books processed. Thank you!");
    }
}
