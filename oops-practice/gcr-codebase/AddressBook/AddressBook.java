package AddressBook;
import java.util.ArrayList;
public class AddressBook {
    private ArrayList<ContactPerson> contactList;
    public AddressBook() {
        contactList = new ArrayList<>();
    }
    //UC1:add contact
    public void addContact(ContactPerson person) {
        contactList.add(person);
        System.out.println("\nContact added successfully!\n");
    }
    public void displayContacts() {
        for (ContactPerson person : contactList) {
            person.displayContact();
        }
    }
}
