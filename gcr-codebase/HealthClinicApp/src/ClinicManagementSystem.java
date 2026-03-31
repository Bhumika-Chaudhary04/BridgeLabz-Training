import java.util.Scanner;

import com.healthclinic.dao.*;
import com.healthclinic.model.*;

public class ClinicManagementSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PatientDAO patientDAO = new PatientDAO();
		DoctorDAO doctorDAO = new DoctorDAO();
		AppointmentDAO appointmentDAO = new AppointmentDAO();

		while (true) {

			System.out.println("---- Welcome to Health Clinic System ----\n");

			System.out.println("1 Register Patient");
			System.out.println("2 Search Patient");
			System.out.println("3 Add Doctor");
			System.out.println("4 Book Appointment");
			System.out.println("5 Exit");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:

				System.out.println("Enter name:");
				String name = sc.nextLine();

				System.out.println("DOB:");
				String dob = sc.nextLine();

				System.out.println("Phone:");
				String phone = sc.nextLine();

				System.out.println("Email:");
				String email = sc.nextLine();

				System.out.println("Address:");
				String address = sc.nextLine();

				System.out.println("Blood group:");
				String bg = sc.nextLine();

				Patient patient = new Patient(name, dob, phone, email, address, bg);

				patientDAO.registerPatient(patient);

				break;

			case 2:

				System.out.println("Enter name to search:");
				String search = sc.nextLine();

				patientDAO.searchPatient(search);

				break;

			case 3:

				System.out.println("Doctor name:");
				String dname = sc.nextLine();

				System.out.println("Specialization:");
				String spec = sc.nextLine();

				System.out.println("Contact:");
				String contact = sc.nextLine();

				System.out.println("Consultation fee:");
				double fee = sc.nextDouble();

				Doctor doctor = new Doctor(dname, spec, contact, fee);

				doctorDAO.addDoctor(doctor);

				break;

			case 4:

				System.out.println("Patient ID:");
				int pid = sc.nextInt();

				System.out.println("Doctor ID:");
				int did = sc.nextInt();
				sc.nextLine();

				System.out.println("Date:");
				String date = sc.nextLine();

				System.out.println("Time:");
				String time = sc.nextLine();

				Appointment appointment = new Appointment(pid, did, date, time);

				appointmentDAO.bookAppointment(appointment);

				break;

			case 5:
				System.exit(0);
			}
		}
	}
}