package constructors_access_modifiers;
public class Book {
	//class attributes
	private String title;
	private String author;
	private int price;
	//default constructor
	Book(){
		title="Atomic Habits";
		author="James Clear";
		price=400;
	}
	//parameterized constructor
	Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	//method to display attributes
	void display() {
		System.out.println("Title of the book is : "+title);
		System.out.println("Author of this book is : "+author);
		System.out.println("Price of this book is : "+price);
		System.out.println("-------------------------------------------------------------");
	}
	public static void main(String[] args) {
		//object
        Book book1=new Book();
        Book book2=new Book("The Silent Patient","Alex Michaelides",600);
        book1.display();
        book2.display();
	}
}


