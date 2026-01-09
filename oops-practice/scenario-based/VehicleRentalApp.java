package VehicleRentalApplication;

import java.util.ArrayList;
import java.util.Scanner;

// Main application
public class VehicleRentalApp {

	static ArrayList<Vehicle> vehicles = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n--- VEHICLE RENTAL SYSTEM ---");
			System.out.println("1. Add Vehicle");
			System.out.println("2. View Vehicles");
			System.out.println("3. Update Vehicle Rent");
			System.out.println("4. Delete Vehicle");
			System.out.println("5. Calculate Rent");
			System.out.println("6. Exit");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> addVehicle();
			case 2 -> viewVehicles();
			case 3 -> updateVehicle();
			case 4 -> deleteVehicle();
			case 5 -> calculateRent();
			case 6 -> {
				System.out.println("Thank you!");
				System.exit(0);
			}
			default -> System.out.println("Invalid choice!");
			}
		}
	}

	// CREATE
	static void addVehicle() {
		System.out.println("1.Bike  2.Car  3.Truck");
		int type = sc.nextInt();

		System.out.print("Vehicle ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Brand: ");
		String brand = sc.nextLine();

		System.out.print("Rent per day: ");
		double rent = sc.nextDouble();

		switch (type) {
		case 1 -> vehicles.add(new Bike(id, brand, rent));
		case 2 -> vehicles.add(new Car(id, brand, rent));
		case 3 -> vehicles.add(new Truck(id, brand, rent));
		default -> {
			System.out.println("Invalid vehicle type");
			return;
		}
		}
		System.out.println("Vehicle added successfully");
	}

	// READ
	static void viewVehicles() {
		if (vehicles.isEmpty()) {
			System.out.println("No vehicles available");
			return;
		}
		for (Vehicle v : vehicles) {
			v.displayInfo(); // polymorphism
		}
	}

	// UPDATE
	static void updateVehicle() {
		if (vehicles.isEmpty()) {
			System.out.println("No vehicles to update");
			return;
		}

		System.out.print("Enter Vehicle ID: ");
		int id = sc.nextInt();

		for (Vehicle v : vehicles) {
			if (v.vehicleId == id) {
				System.out.print("New Rent per day: ");
				v.rentPerDay = sc.nextDouble();
				System.out.println("Vehicle updated");
				return;
			}
		}
		System.out.println("Vehicle not found");
	}

	// DELETE
	static void deleteVehicle() {
		if (vehicles.isEmpty()) {
			System.out.println("No vehicles to delete");
			return;
		}

		System.out.print("Enter Vehicle ID: ");
		int id = sc.nextInt();

		boolean removed = vehicles.removeIf(v -> v.getVehicleId() == id);

		if (removed)
			System.out.println("Vehicle deleted");
		else
			System.out.println("Vehicle not found");
	}

	// RENT CALCULATION
	static void calculateRent() {
		System.out.print("Enter Vehicle ID: ");
		int id = sc.nextInt();

		System.out.print("Enter Days: ");
		int days = sc.nextInt();

		for (Vehicle v : vehicles) {
			if (v.getVehicleId() == id) {
				System.out.println("Total Rent = " + v.calculateRent(days));
				return;
			}
		}
		System.out.println("Vehicle not found");
	}
}
