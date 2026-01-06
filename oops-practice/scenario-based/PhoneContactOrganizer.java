package scenario_based;
import java.util.*;
class InvalidPhoneNumberException extends Exception{
	public InvalidPhoneNumberException(String s) {
		super(s);
	}
}
class Contact{
	//attributes
	private String name;
	private String phoneNumber;
	//constructor
	Contact(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	//getter Methods
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	//setter Methods
	public void setName(String name){
		this.name=name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public void getDetails() {
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("-----------------------------");
	}
	
}
class PhoneContact {
	static List<Contact> contactList=new ArrayList<>();
	public static void addContact(String name,String phoneNumber) throws InvalidPhoneNumberException {
		if(!phoneNumber.matches("\\d{10}")) {
			throw new InvalidPhoneNumberException("Phone number should be of 10 digits");
		}
		for(Contact contact:contactList) {
			if(contact.getPhoneNumber().equals(phoneNumber)) {
				System.out.println("Duplicate phone number : "+phoneNumber);
				return;
			}
		
		}
		Contact contact=new Contact(name,phoneNumber);
		contactList.add(contact);
		
		
	}
	public static void deleteContact(String phoneNumber) {
		System.out.println("\n--------------------------");
		for (Contact contact:contactList) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                contactList.remove(contact);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
		System.out.println("Contact does not exist");
	}
	public static void searchContact(String name) {
		System.out.println("---------------------------");
		for(Contact contact:contactList) {
			if(contact.getName().equals(name)) {
				System.out.println("Contact Found ");
				System.out.print(name+" "+contact.getPhoneNumber());
				return;
			}
		}
		System.out.println("Contact with the name "+name+" does not exist");
	}
	public static void displayDetails() {
		for(Contact contact:contactList) {
			System.out.println(contact.getName()+" : "+contact.getPhoneNumber());
		}
		System.out.println("----------------------------------------------------");
	}
}

public class PhoneContactOrganizer{
	public static void main(String[] args) {
		try{
			PhoneContact.addContact("Alice","9876543210");
			PhoneContact.displayDetails();
			PhoneContact.addContact("Bob","1234567890");
			PhoneContact.displayDetails();
            // Duplicate test
			PhoneContact.addContact("Charlie","9876543210");
            // Invalid number test
			PhoneContact.addContact("David","12345");
			PhoneContact.addContact("Charlie","9876543211");
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
		PhoneContact.searchContact("Bob");
		PhoneContact.deleteContact("1234567890");;
		PhoneContact.searchContact("Bob");	
	}
}
