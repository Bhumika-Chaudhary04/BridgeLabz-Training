package CabBookingManagementSystem;

import java.util.Scanner;

public class CabBookingManagementSystem {
	private static void printMainMenu() {
		System.out.println("""
				------- MAIN MENU --------
				1. User Management
				2. Driver Management
				3. Ride Options
				0. Exit
				""");
	}

	private static void printUserMenu() {
		System.out.println("""
				--- USER MENU ---
				1. Add User
				2. Update User
				3. Delete User
				4. List Users
				0. Back
				""");
	}

	private static void printDriverMenu() {
		System.out.println("""
				--- DRIVER MENU ---
				1. Add Driver
				2. Update Driver
				3. Delete Driver
				4. List Drivers
				0. Back
				""");
	}

	private static void printRideMenu() {
		System.out.println("""
				--- RIDE MENU ---
				1. Book Ride
				2. View Ride History
				0. Back
				""");
	}

	public static void main(String[] args) {
		RideService service = new RideService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			printMainMenu();
			System.out.print("Choose option: ");
			int choice = sc.nextInt();
			sc.nextLine();
			// for main menu
			switch (choice) {
			case 1: // user management
				while (true) {
					printUserMenu();
					System.out.print("Choose option: ");
					int user = sc.nextInt();
					sc.nextLine();

					if (user == 0)
						break;

					switch (user) {
					case 1: // add user
						System.out.print("Enter User ID: ");
						int userId = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter Name: ");
						service.addUser(new User(userId, sc.nextLine()));
						break;

					case 2: // update user
						System.out.print("Enter User ID: ");
						int userIdUpdate = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter New Name: ");
						service.updateUser(userIdUpdate, sc.nextLine());
						break;

					case 3: // delete user
						System.out.print("Enter User ID: ");
						int userIdDelete = sc.nextInt();
						service.deleteUser(userIdDelete);
						break;

					case 4: // list users
						service.listUsers();
						break;

					default:
						System.out.println("Invalid option.");
					}
				}
				break;
			case 2: // Driver Management
				while (true) {
					printDriverMenu();
					System.out.print("Choose option: ");
					int d = sc.nextInt();
					sc.nextLine();

					if (d == 0)
						break;

					switch (d) {

					case 1: // add driver
						System.out.print("Enter Driver ID: ");
						int driverId = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter Name: ");
						service.addDriver(new Driver(driverId, sc.nextLine()));
						break;

					case 2: // update driver
						System.out.print("Enter Driver ID: ");
						int driverIdUpdate = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter New Name: ");
						service.updateDriver(driverIdUpdate, sc.nextLine());
						break;

					case 3: // delete driver
						System.out.print("Enter Driver ID: ");
						int driverIdDelete = sc.nextInt();
						service.deleteDriver(driverIdDelete);
						break;

					case 4: // list drivers
						service.listDrivers();
						break;

					default:
						System.out.println("Invalid option.");
					}
				}
				break;

			// Ride options
			case 3:
				while (true) {
					printRideMenu();
					System.out.print("Choose option: ");
					int ride = sc.nextInt();
					sc.nextLine();

					if (ride == 0)
						break;

					switch (ride) {

					case 1: // book ride
						try {
							System.out.print("Enter User ID: ");
							int userId = sc.nextInt();
							System.out.print("Enter Distance (km): ");
							double distance = sc.nextDouble();
							System.out.print("Peak Pricing? (1=yes / 0=no): ");
							boolean peak = sc.nextInt() == 1;

							service.bookRide(userId, distance, peak);

						} catch (NoDriverAvailableException e) {
							System.out.println(e.getMessage());
						}
						break;

					case 2: // view ride history
						System.out.print("Enter User ID: ");
						int h = sc.nextInt();
						User user = service.getUser(h);
						if (user != null)
							user.printRideHistory();
						else
							System.out.println("User not found.");
						break;

					default:
						System.out.println("Invalid option.");
					}
				}
				break;

			case 0:
				System.out.println("Goodbye!");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}