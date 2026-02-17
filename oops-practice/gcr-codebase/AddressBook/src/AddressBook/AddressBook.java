package AddressBook;

import java.util.ArrayList;
import java.util.Comparator;

public class AddressBook {

	private String addressBookName;
	private ArrayList<ContactPerson> contactList;

	public AddressBook(String addressBookName) {
		this.addressBookName = addressBookName;
		this.contactList = new ArrayList<>();
	}

	public String getAddressBookName() {
		return addressBookName;
	}

	// UC7: Duplicate check using equals()
	public void addContact(ContactPerson person) {
		if (contactList.contains(person)) {
			System.out.println("Duplicate Entry! Contact already exists.");
			return;
		}
		contactList.add(person);
		System.out.println("Contact added successfully!");
	}

	public void editContact(String firstName, String lastName) {
		for (ContactPerson contact : contactList) {
			if (contact.getFirstName().equalsIgnoreCase(firstName)
					&& contact.getLastName().equalsIgnoreCase(lastName)) {
				// existing edit logic (unchanged)
				return;
			}
		}
		System.out.println("Contact not found");
	}

	public void deleteContact(String firstName, String lastName) {
		contactList.removeIf(contact -> contact.getFirstName().equalsIgnoreCase(firstName)
				&& contact.getLastName().equalsIgnoreCase(lastName));
	}

	public void displayContacts() {
		if (contactList.isEmpty()) {
			System.out.println("No contacts found.");
			return;
		}
		for (ContactPerson person : contactList) {
			person.displayContact();
		}
	}

	public ArrayList<ContactPerson> getContactList() {
		return contactList;
	}

	public void sortContactsByName() {
		if (contactList.isEmpty()) {
			System.out.println("No contacts to sort.");
			return;
		}

		contactList.sort(Comparator.comparing(ContactPerson::getFirstName, String.CASE_INSENSITIVE_ORDER)
				.thenComparing(ContactPerson::getLastName, String.CASE_INSENSITIVE_ORDER));

		System.out.println("\nContacts sorted alphabetically by name:");
		contactList.forEach(System.out::println); // uses toString()
	}

	public void sortByCity() {
		if (contactList.isEmpty()) {
			System.out.println("No contacts to sort.");
			return;
		}

		contactList.sort(Comparator.comparing(ContactPerson::getCity, String.CASE_INSENSITIVE_ORDER));

		System.out.println("\nContacts sorted by City:");
		contactList.forEach(System.out::println);
	}

	public void sortByState() {
		if (contactList.isEmpty()) {
			System.out.println("No contacts to sort.");
			return;
		}

		contactList.sort(Comparator.comparing(ContactPerson::getState, String.CASE_INSENSITIVE_ORDER));

		System.out.println("\nContacts sorted by State:");
		contactList.forEach(System.out::println);
	}
	public void sortByZip() {
	    if (contactList.isEmpty()) {
	        System.out.println("No contacts to sort.");
	        return;
	    }

	    contactList.sort(Comparator.comparing(ContactPerson::getZipCode));

	    System.out.println("\nContacts sorted by Zip:");
	    contactList.forEach(System.out::println);
	}
}