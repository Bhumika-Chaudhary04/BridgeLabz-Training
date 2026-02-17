package AddressBook;

import java.util.ArrayList;

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
}