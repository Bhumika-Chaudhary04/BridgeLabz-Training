package AddressBook;

import java.util.Scanner;

// UC1–UC6: Console-driven Address Book Application
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService();
        int choice;
        // UC5+UC6
        do {
            System.out.println("\n----- WELCOME TO ADDRESS BOOK-----");
            System.out.println("1. Create Address Book");
            System.out.println("2. Display Address Books");
            System.out.println("3. Add Contact");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Display Contacts");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            AddressBook book;
            String bookName;
            switch (choice) {
                case 1: // UC6
                    System.out.print("Enter Address Book Name: ");
                    service.addAddressBook(sc.nextLine());
                    break;
                case 2: // UC6
                    service.displayAddressBooks();
                    break;
                case 3: // UC2
                    System.out.print("Enter Address Book Name: ");
                    bookName = sc.nextLine();
                    book = service.getAddressBook(bookName);
                    if (book == null) {
                        System.out.println("Address Book not found!");
                        break;
                    }
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("State: ");
                    String state = sc.nextLine();
                    System.out.print("Zip: ");
                    String zip = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    book.addContact(new ContactPerson(
                            fn, ln, address, city, state, zip, phone, email));
                    break;
                case 4: // UC3
                    System.out.print("Enter Address Book Name: ");
                    book = service.getAddressBook(sc.nextLine());
                    if (book == null)
                        break;
                    System.out.print("First Name: ");
                    fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    ln = sc.nextLine();
                    book.editContact(fn, ln);
                    break;
                case 5: // UC4
                    System.out.print("Enter Address Book Name: ");
                    book = service.getAddressBook(sc.nextLine());
                    if (book == null)
                        break;
                    System.out.print("First Name: ");
                    fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    ln = sc.nextLine();
                    book.deleteContact(fn, ln);
                    break;
                case 6:
                    System.out.print("Enter Address Book Name: ");
                    book = service.getAddressBook(sc.nextLine());
                    if (book != null)
                        book.displayContacts();
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
