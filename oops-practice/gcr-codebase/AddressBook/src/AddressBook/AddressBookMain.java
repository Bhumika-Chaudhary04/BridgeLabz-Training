package AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AddressBookService service = new AddressBookService();
		int choice;

		do {
			System.out.println("\n----- WELCOME TO ADDRESS BOOK -----");
			System.out.println("1. Create Address Book");
			System.out.println("2. Display Address Books");
			System.out.println("3. Add Contact");
			System.out.println("4. Edit Contact");
			System.out.println("5. Delete Contact");
			System.out.println("6. Display Contacts");
			System.out.println("7. Search Person by City");
			System.out.println("8. Search Person by State");
			System.out.println("9. View Persons by City");
			System.out.println("10. View Persons by State");
			System.out.println("0. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter Address Book Name: ");
				service.addAddressBook(sc.nextLine());
				break;

			case 2:
				service.displayAddressBooks();
				break;

			case 9:
				service.viewPersonsByCity();
				break;

			case 10:
				service.viewPersonsByState();
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 0);

		sc.close();
	}
}