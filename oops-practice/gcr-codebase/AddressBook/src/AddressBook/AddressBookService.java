package AddressBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class AddressBookService {

	private Map<String, AddressBook> addressBookMap;

	public AddressBookService() {
		addressBookMap = new HashMap<>();
	}

	public void addAddressBook(String name) {
		if (addressBookMap.containsKey(name)) {
			System.out.println("Address Book already exists!");
			return;
		}
		addressBookMap.put(name, new AddressBook(name));
		System.out.println("Address Book added successfully!");
	}

	public AddressBook getAddressBook(String name) {
		return addressBookMap.get(name);
	}

	public void displayAddressBooks() {
		if (addressBookMap.isEmpty()) {
			System.out.println("No Address Books available.");
			return;
		}
		System.out.println("Available Address Books:");
		for (String name : addressBookMap.keySet()) {
			System.out.println("- " + name);
		}
	}

	//UC8: Search Person by City across ALL Address Books
	public List<ContactPerson> searchByCity(String city) {
		List<ContactPerson> result = new ArrayList<>();

		for (AddressBook book : addressBookMap.values()) {
			for (ContactPerson person : book.getContactList()) {
				if (person.getCity().equalsIgnoreCase(city)) {
					result.add(person);
				}
			}
		}
		return result;
	}

	//UC8: Search Person by State across ALL Address Books
	public List<ContactPerson> searchByState(String state) {
		List<ContactPerson> result = new ArrayList<>();

		for (AddressBook book : addressBookMap.values()) {
			for (ContactPerson person : book.getContactList()) {
				if (person.getState().equalsIgnoreCase(state)) {
					result.add(person);
				}
			}
		}
		return result;
	}
}