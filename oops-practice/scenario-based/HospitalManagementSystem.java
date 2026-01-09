package HospitalPatientManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class HospitalManagementSystem {

	static ArrayList<Patient> patients = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Doctor doctor = new Doctor(1, "Dr. Sharma", "Cardiology");

		while (true) {
			System.out.println("\n===== Hospital Patient Management System =====");
			System.out.println("1. Add Patient");
			System.out.println("2. View Patients");
			System.out.println("3. Update Patient");
			System.out.println("4. Delete Patient");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> addPatient(doctor);
			case 2 -> viewPatients();
			case 3 -> updatePatient();
			case 4 -> deletePatient();
			case 5 -> {
				System.out.println("Thank you!");
				System.exit(0);
			}
			default -> System.out.println("Invalid choice");
			}
		}
	}

	// CREATE
	static void addPatient(Doctor doctor) {
		System.out.println("1. InPatient  2. OutPatient");
		int type = sc.nextInt();

		if (type != 1 && type != 2) {
			System.out.println("Invalid patient type");
			return;
		}

		System.out.print("Patient ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Age: ");
		int age = sc.nextInt();

		if (type == 1) {
			System.out.print("Days Admitted: ");
			int days = sc.nextInt();

			System.out.print("Daily Charge: ");
			double charge = sc.nextDouble();

			patients.add(new InPatient(id, name, age, doctor, days, charge));
		} else {
			System.out.print("Consultation Fee: ");
			double fee = sc.nextDouble();

			patients.add(new OutPatient(id, name, age, doctor, fee));
		}

		System.out.println("Patient added successfully");
	}

	// READ
	static void viewPatients() {
		if (patients.isEmpty()) {
			System.out.println("No patients available");
			return;
		}

		System.out.println("\nTotal Patients: " + patients.size());
		for (Patient p : patients) {
			p.displayInfo(); // Polymorphism
		}
	}

	// UPDATE
	static void updatePatient() {
		if (patients.isEmpty()) {
			System.out.println("No patients available to update");
			return;
		}

		System.out.print("Enter Patient ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		for (Patient p : patients) {
			if (p.getPatientId() == id) {
				System.out.print("New Name: ");
				p.setName(sc.nextLine());

				System.out.print("New Age: ");
				p.setAge(sc.nextInt());

				System.out.println("Patient updated successfully");
				return;
			}
		}
		System.out.println("Patient not found");
	}

	// DELETE
	static void deletePatient() {
		if (patients.isEmpty()) {
			System.out.println("No patients available to delete");
			return;
		}

		System.out.print("Enter Patient ID: ");
		int id = sc.nextInt();

		boolean removed = patients.removeIf(p -> p.getPatientId() == id);

		if (removed) {
			System.out.println("Patient deleted successfully");
		} else {
			System.out.println("Patient not found");
		}
	}
}
