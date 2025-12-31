package constructors_access_modifiers;
public class LibraryBook {
	private String title;
	private String author;
	private int price;
	private boolean availability;
	//default constructor
    LibraryBook(){
	    title="Atomic Habits";
	    author="James Clear";
	    price=400;
	    availability=true;
    }
    //parameterized constructor
    LibraryBook(String title,String author,int price,boolean availability){
	    this.title=title;
	    this.author=author;
	    this.price=price;
	    this.availability=availability;
	}
    //copy constructor
    LibraryBook(LibraryBook library){
	    this.title=library.title;
	    this.author=library.author;
	    this.price=library.price;
	    this.availability=library.availability;
	}
    //method to borrow a book
    void borrowBook() {
    	if(availability) {
    		availability=false;
    		System.out.println("You have successfully borrowed : "+title);
    	}
    	else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
    	}
    }
    //display method
    void display() {
    	System.out.println("Title : "+title);
    	System.out.println("Author : "+author);
    	System.out.println("Price : "+price);
    	System.out.println("Availability : "+availability);
    	System.out.println("------------------------------------------");
    }
    public static void main(String[] args) {
    	//objects
		LibraryBook lb1=new LibraryBook();
		LibraryBook lb2=new LibraryBook("Think and Grow Rich","Napoleaon Hill",450,true);
		LibraryBook lb3=new LibraryBook("Harry Potter","J.K. Rowling",800,false);
		lb1.display();
		lb2.display();
		lb3.display();
		lb3.borrowBook();
		
	}
}
