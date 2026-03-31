package RestaurantTableReservationSystem;
import java.util.Scanner;
public class RestaurantTableReservationSystem {
	public static void main(String[] args) {
		RestaurantReservationSystem system = new RestaurantReservationSystem();
		Scanner sc = new Scanner(System.in);
		//pre-added tables
		system.addTable(new Table(1, 4));
		system.addTable(new Table(2, 2));
		system.addTable(new Table(3, 6));
		int choice;
		do {
			System.out.println("\n===== Restaurant Table Reservation System =====");
			System.out.println("1. Reserve Table");
			System.out.println("2. Cancel Reservation");
			System.out.println("3. Show Available Tables");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // consume newline
			switch (choice) {
			case 1:
				try {
					System.out.print("Enter Table Number: ");
					int tableNumber = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Time Slot (e.g., 7PM-8PM): ");
					String timeSlot = sc.nextLine();
					System.out.print("Enter Customer Name: ");
					String customerName = sc.nextLine();
					system.reserveTable(tableNumber, timeSlot, customerName);
				} catch (TableAlreadyReservedException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.print("Enter Table Number: ");
				int tableNumber = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Time Slot: ");
				String timeSlot = sc.nextLine();
				system.cancelReservation(tableNumber, timeSlot);
				break;
			case 3:
				System.out.print("Enter Time Slot: ");
				String slot = sc.nextLine();
				system.showAvailableTables(slot);
				break;
			case 4:
				System.out.println("Thank you! Exiting system.");
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 4);
		sc.close();
	}
}
