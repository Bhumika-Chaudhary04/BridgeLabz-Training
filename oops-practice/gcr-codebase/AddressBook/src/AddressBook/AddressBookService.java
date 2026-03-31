package AddressBook;

import java.util.*;

public class AddressBookService {

	private Map<String, AddressBook> addressBookMap;

	// UC9 Dictionaries
	private Map<String, List<ContactPerson>> cityPersonMap;
	private Map<String, List<ContactPerson>> statePersonMap;

	public AddressBookService() {
		addressBookMap = new HashMap<>();
		cityPersonMap = new HashMap<>();
		statePersonMap = new HashMap<>();
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
		addressBookMap.keySet().forEach(name -> System.out.println("- " + name));
	}

	// -------- UC8 METHODS (already present) --------
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

	// -------- UC9 METHODS --------
	public void viewPersonsByCity() {
		cityPersonMap.clear();

		for (AddressBook book : addressBookMap.values()) {
			for (ContactPerson person : book.getContactList()) {
				cityPersonMap.computeIfAbsent(person.getCity(), k -> new ArrayList<>()).add(person);
			}
		}

		if (cityPersonMap.isEmpty()) {
			System.out.println("No persons available.");
			return;
		}

		cityPersonMap.forEach((city, persons) -> {
			System.out.println("\nCity: " + city);
			persons.forEach(ContactPerson::displayContact);
		});
	}

	public void viewPersonsByState() {
		statePersonMap.clear();

		for (AddressBook book : addressBookMap.values()) {
			for (ContactPerson person : book.getContactList()) {
				statePersonMap.computeIfAbsent(person.getState(), k -> new ArrayList<>()).add(person);
			}
		}

		if (statePersonMap.isEmpty()) {
			System.out.println("No persons available.");
			return;
		}

		statePersonMap.forEach((state, persons) -> {
			System.out.println("\nState: " + state);
			persons.forEach(ContactPerson::displayContact);
		});
	}
	// -------- UC10 : Count Persons by City --------
	public void countPersonsByCity() {
	    Map<String, Integer> cityCountMap = new HashMap<>();

	    for (AddressBook book : addressBookMap.values()) {
	        for (ContactPerson person : book.getContactList()) {
	            cityCountMap.put(
	                    person.getCity(),
	                    cityCountMap.getOrDefault(person.getCity(), 0) + 1
	            );
	        }
	    }

	    if (cityCountMap.isEmpty()) {
	        System.out.println("No persons available.");
	        return;
	    }

	    System.out.println("\nPersons count by City:");
	    cityCountMap.forEach((city, count) ->
	            System.out.println(city + " : " + count));
	}

	// -------- UC10 : Count Persons by State --------
	public void countPersonsByState() {
	    Map<String, Integer> stateCountMap = new HashMap<>();

	    for (AddressBook book : addressBookMap.values()) {
	        for (ContactPerson person : book.getContactList()) {
	            stateCountMap.put(
	                    person.getState(),
	                    stateCountMap.getOrDefault(person.getState(), 0) + 1
	            );
	        }
	    }

	    if (stateCountMap.isEmpty()) {
	        System.out.println("No persons available.");
	        return;
	    }

	    System.out.println("\nPersons count by State:");
	    stateCountMap.forEach((state, count) ->
	            System.out.println(state + " : " + count));
	}
	public void sortAddressBookByName(String addressBookName) {
	    AddressBook book = addressBookMap.get(addressBookName);

	    if (book == null) {
	        System.out.println("Address Book not found.");
	        return;
	    }

	    book.sortContactsByName();
	}
	public void sortByCity(String addressBookName) {
	    AddressBook book = addressBookMap.get(addressBookName);
	    if (book == null) {
	        System.out.println("Address Book not found.");
	        return;
	    }
	    book.sortByCity();
	}
	public void sortByState(String addressBookName) {
	    AddressBook book = addressBookMap.get(addressBookName);
	    if (book == null) {
	        System.out.println("Address Book not found.");
	        return;
	    }
	    book.sortByState();
	}
	public void sortByZip(String addressBookName) {
	    AddressBook book = addressBookMap.get(addressBookName);
	    if (book == null) {
	        System.out.println("Address Book not found.");
	        return;
	    }
	    book.sortByZip();
	}
}