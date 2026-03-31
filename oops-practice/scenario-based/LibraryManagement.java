package scenario_based;
import java.util.*;
class BookNotAvailableException extends Exception{
	public BookNotAvailableException(String message) {
		super(message);
	}
}
//book class
class Book{
	String title;
	String author;
	boolean isAvailable;
	Book(String title,String author,boolean isAvailable){
		this.title=title;
		this.author=author;
		this.isAvailable=isAvailable;
	}
	//getter methods
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean getAvailability() {
		return isAvailable;
	}
	//method to check availability of books
	public void checkout() throws BookNotAvailableException{
		if(!isAvailable) {
			throw new BookNotAvailableException("Book is already checked out");
		}
		isAvailable=false;
	}
	public String toString() {
        return String.format(
            "Title: %-20s Author: %-15s Status: %s",
            title, author, isAvailable ? "Available" : "Checked Out"
        );
    }
}
class Library {
    private List<Book> books = new ArrayList<>();
    // Load books from array
    public void loadBooks(Book[] bookArray) {
        for (Book b : bookArray) {
            books.add(b);
        }
    }
    // Display all books
    public void displayBooks() {
        System.out.println("\n Library Books");
        for (Book b : books) {
            System.out.println(b);
        }
    }
    // Search by partial title
    public void searchByTitle(String keyword) {
        System.out.println("Search Results:");
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No books found.");
        }
    }
    // Checkout book
    public void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.checkout();
                System.out.println("Book checked out successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
//main class
public class LibraryManagement {
	public static void main(String[] args) {
		Book[] bookArray = {new Book("Java Programming", "Gosling", true),new Book("Clean Code", "Robert Martin", true),new Book("DSA", "Mark Allen", false)};
        Library library = new Library();
        library.loadBooks(bookArray);
        library.displayBooks();
        library.searchByTitle("code");
        //try catch block
        try {
            library.checkoutBook("Clean Code");
            library.checkoutBook("DSA"); // Exception case
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        library.displayBooks();
	}
}
