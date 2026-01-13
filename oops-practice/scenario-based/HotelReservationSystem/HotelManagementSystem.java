package HotelReservationSystem;

import java.util.Scanner;

public class HotelManagementSystem {

	static Room[] rooms = new Room[10];
	static Reservation[] reservations = new Reservation[10];
	static int roomCount = 0;
	static int resCount = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PricingStrategy pricing = new SeasonalPricing();

		while (true) {
			System.out.println("\n--- HOTEL MANAGEMENT SYSTEM ---");
			System.out.println("1. Add Room");
			System.out.println("2. View Rooms");
			System.out.println("3. Book Room");
			System.out.println("4. Check-out");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("1. Standard Room\n2. Deluxe Room");
				int type = sc.nextInt();
				System.out.print("Room Number: ");
				int rn = sc.nextInt();

				if (type == 1)
					rooms[roomCount++] = new StandardRoom(rn);
				else
					rooms[roomCount++] = new DeluxeRoom(rn);

				System.out.println("Room added successfully");
				break;

			case 2:
				for (int i = 0; i < roomCount; i++) {
					System.out.println("Room " + rooms[i].roomNumber + " | Price: " + rooms[i].price + " | Available: "
							+ rooms[i].isAvailable);
				}
				break;

			case 3:
				System.out.print("Guest ID: ");
				int gid = sc.nextInt();
				sc.nextLine();
				System.out.print("Guest Name: ");
				String name = sc.nextLine();
				System.out.print("Room Number: ");
				int roomNo = sc.nextInt();
				System.out.print("Days: ");
				int days = sc.nextInt();

				try {
					Room selected = null;
					for (int i = 0; i < roomCount; i++) {
						if (rooms[i].roomNumber == roomNo)
							selected = rooms[i];
					}

					Reservation r = new Reservation(new Guest(gid, name), selected, days, pricing);
					reservations[resCount++] = r;

					System.out.println("Room booked successfully");
					System.out.println("Bill: ₹" + r.generateBill());

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				System.out.print("Room Number: ");
				int checkOutRoom = sc.nextInt();

				for (int i = 0; i < roomCount; i++) {
					if (rooms[i].roomNumber == checkOutRoom) {
						rooms[i].checkout();
						System.out.println("Checked out successfully");
					}
				}
				break;

			case 5:
				System.out.println("Thank you!");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
