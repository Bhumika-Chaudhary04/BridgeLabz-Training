package scenario_based;
import java.util.Scanner;
class Book {
    String title;
    String author;
    boolean isAvailable;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}
public class LibraryManagementSystem {
    static Scanner sc = new Scanner(System.in);
    // Display all books
    static void displayBooks(Book[] books, int count) {
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < count; i++) {
            System.out.println(
                (i + 1) + ". " + books[i].title + " | " +
                books[i].author + " | " +
                (books[i].isAvailable ? "Available" : "Checked Out")
            );
        }
    }
    // Search book by partial title
    static void searchBook(Book[] books, int count, String keyword) {
        boolean found = false;
        System.out.println("\nSearch Results:");
        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(
                    books[i].title + " | " +
                    books[i].author + " | " +
                    (books[i].isAvailable ? "Available" : "Checked Out")
                );
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    // Checkout or return book
    static void updateBookStatus(Book[] books, int count, String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                if (books[i].isAvailable) {
                    books[i].isAvailable = false;
                    System.out.println("Book checked out successfully.");
                } else {
                    books[i].isAvailable = true;
                    System.out.println("Book returned successfully.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
    public static void main(String[] args) {
        Book[] books = new Book[10];
        int count = 4;
        // Initial book data
        books[0] = new Book("Java Programming", "James Gosling");
        books[1] = new Book("Clean Code", "Robert Martin");
        books[2] = new Book("Data Structures", "Mark Allen Weiss");
        books[3] = new Book("Operating Systems", "Silberschatz");
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display Books");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Checkout / Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer
            switch (choice) {
                case 1:
                    displayBooks(books, count);
                    break;
                case 2:
                    System.out.print("Enter title keyword: ");
                    String keyword = sc.nextLine();
                    searchBook(books, count, keyword);
                    break;
                case 3:
                    System.out.print("Enter exact book title: ");
                    String title = sc.nextLine();
                    updateBookStatus(books, count, title);
                    break;
                case 4:
                    System.out.println("Exiting Library System...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
