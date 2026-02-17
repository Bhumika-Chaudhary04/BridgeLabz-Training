package AddressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookService {
    private Map<String, AddressBook> addressBookMap;

    public AddressBookService() {
        addressBookMap = new HashMap<>();
    }

    public void addAddressBook(String name) {
        // check uniqueness
        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book already exists!");
            return;
        }
        addressBookMap.put(name, new AddressBook(name));
        System.out.println("Address Book added successfully!");
    }

    // get AddressBook by name
    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    // display all Address Books
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
}