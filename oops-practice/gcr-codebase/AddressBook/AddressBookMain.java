package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("------------Welcome to Address Book Program----------------");
        Scanner sc = new Scanner(System.in);
        // UC2 :using console to take contact details from user and add them to
        // AddressBook
        AddressBook addressBook = new AddressBook();
        // console input
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter State: ");
        String state = sc.nextLine();
        System.out.print("Enter Zip: ");
        String zip = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        // create contact object
        ContactPerson person = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
        // add contact to addressBook
        addressBook.addContact(person);
        // display contacts
        addressBook.displayContacts();
        // edit contact
        System.out.print("\nEnter first name of the contact to edited : ");
        firstName = sc.nextLine();
        System.out.print("Enter last name of the contact to be edited : ");
        lastName = sc.nextLine();
        // UC3:edit contact
        addressBook.editContact(firstName, lastName);
        addressBook.displayContacts();
        // UC4:delete contact
        System.out.println("Enter first name of the contact to be deleted : ");
        firstName = sc.nextLine();
        System.out.println("Enter last name of the person to be deleted : ");
        lastName = sc.nextLine();
        addressBook.deleteContact(firstName, lastName);
        addressBook.displayContacts();
        sc.close();
    }
}
