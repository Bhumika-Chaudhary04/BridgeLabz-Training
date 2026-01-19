package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private ArrayList<ContactPerson> contactList;

	public AddressBook() {
		contactList = new ArrayList<>();
	}

	// UC1:add contact
	public void addContact(ContactPerson person) {
		contactList.add(person);
		System.out.println("\nContact added successfully!\n");
	}

	// UC3:edit contact
	public void editContact(String firstName, String lastName) {
		boolean found = false;
		for (ContactPerson contact : contactList) {
			if (contact.getFirstName().equalsIgnoreCase(firstName)
					&& contact.getLastName().equalsIgnoreCase(lastName)) {
				found = true;
				Scanner sc = new Scanner(System.in);
				int choice;
				do {
					System.out.println("---Welcome to edit Contact---");
					System.out.println("Select field to edit:");
					System.out.println("1. Address");
					System.out.println("2. City");
					System.out.println("3. State");
					System.out.println("4. Zip");
					System.out.println("5. Phone Number");
					System.out.println("6. Email");
					System.out.println("0. Done Editing");
					choice = sc.nextInt();
					sc.nextLine();
					switch (choice) {
						case 1:
							System.out.print("Enter new address : ");
							String address = sc.nextLine();
							contact.setAddress(address);
							break;
						case 2:
							System.out.println("Enter new city: ");
							String city = sc.nextLine();
							contact.setCity(city);
							break;
						case 3:
							System.out.println("Enter new state: ");
							String state = sc.nextLine();
							contact.setState(state);
							break;
						case 4:
							System.out.println("Enter new Zip Code : ");
							String zipCode = sc.nextLine();
							contact.setZip(zipCode);
							break;
						case 5:
							System.out.println("Enter new phone number : ");
							String phoneNumber = sc.nextLine();
							contact.setPhoneNumber(phoneNumber);
							break;
						case 6:
							System.out.println("Enter new email : ");
							String email = sc.nextLine();
							contact.setEmail(email);
							break;
						case 0:
							System.out.println("Editing completed");
							break;
						default:
							System.out.println("Invalid choice");
					}
				} while (choice != 0);

				System.out.println("Contact updated successfully!");
				break;
			}
		}
		if (!found) {
			System.out.println("Contact not found");
		}
	}

	// UC4:delete contact
	public void deleteContact(String firstName, String lastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getFirstName().equalsIgnoreCase(firstName)
					&& contactList.get(i).getLastName().equalsIgnoreCase(lastName)) {
				contactList.remove(i);
				System.out.println("Contact deleted");
				return;
			}
		}
		System.out.println("Contact not found");
	}

	public void displayContacts() {
		for (ContactPerson person : contactList) {
			person.displayContact();
		}
	}
}
