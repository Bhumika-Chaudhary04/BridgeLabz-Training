package oops_pillars;
import java.util.*;
//interface for reservable items
interface Reservable {
    void reserveItem(String borrower); //reserve item
    boolean checkAvailability(); //check if item is available
}
//abstract base class for library items
abstract class LibraryItem {
    private String itemId; //item id
    private String title; //item title
    private String author; //author name
    protected boolean isAvailable = true; //availability
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId; //initialize id
        this.title = title; //initialize title
        this.author = author; //initialize author
    }
    public abstract int getLoanDuration(); //abstract loan duration
    public void getItemDetails() {
        System.out.println("Item ID  : " + itemId); //print id
        System.out.println("Title    : " + title); //print title
        System.out.println("Author   : " + author); //print author
        System.out.println("Available: " + isAvailable); //print availability
    }
    public boolean isAvailable() {
        return isAvailable; //return availability
    }
    public void setAvailability(boolean available) {
        isAvailable = available; //set availability
    }
}
//book class implementing reservable
class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author); //initialize book
    }
    @Override
    public int getLoanDuration() {
        return 21; //21 days loan
    }
    @Override
    public void reserveItem(String borrower) {
        if(isAvailable) {
            isAvailable = false; //reserve item
            System.out.println("book reserved by " + borrower);
        } else System.out.println("book not available");
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable; //check if book is available
    }
}
//magazine class implementing reservable
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String id, String title, String author) {
        super(id, title, author); //initialize magazine
    }
    @Override
    public int getLoanDuration() {
        return 7; //7 days loan
    }
    @Override
    public void reserveItem(String borrower) {
        if(isAvailable) {
            isAvailable = false; //reserve magazine
            System.out.println("magazine reserved by " + borrower);
        } else System.out.println("magazine not available");
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable; //check availability
    }
}
//dvd class implementing reservable
class DVD extends LibraryItem implements Reservable {
    public DVD(String id, String title, String author) {
        super(id, title, author); //initialize dvd
    }
    @Override
    public int getLoanDuration() {
        return 5; //5 days loan
    }
    @Override
    public void reserveItem(String borrower) {
        if(isAvailable) {
            isAvailable = false; //reserve dvd
            System.out.println("dvd reserved by " + borrower);
        } else System.out.println("dvd not available");
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable; //check availability
    }
}
//main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B101", "Java Programming", "Author A")); //add book
        items.add(new Magazine("M201", "Tech Monthly", "Author B")); //add magazine
        items.add(new DVD("D301", "Movie DVD", "Director C")); //add dvd
        for(LibraryItem item : items) {
            item.getItemDetails(); //display item
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days"); //print loan
            if(item instanceof Reservable) {
                Reservable r = (Reservable)item;
                System.out.println("available? " + r.checkAvailability()); //check availability
                r.reserveItem("User1"); //reserve item
                System.out.println("available? " + r.checkAvailability()); //check again
            }
            System.out.println("------------------------------");
        }
    }
}
