package inheritance;
//super class
class Book{
	String title;
	int publicationYear;
	Book(String title,int publicationYear){
		this.title=title;
		this.publicationYear=publicationYear;
	}
	void displayInfo() {
		System.out.println("Book title : "+title);
		System.out.println("Publication Year : "+publicationYear);
	}
}
//sub class
class Author extends Book {
	String name;
	String bio;
	Author(String title,int publicationYear,String name,String bio){
		super(title,publicationYear);
		this.name=name;
		this.bio=bio;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Author name : "+name);
		System.out.println("Bio : "+bio);
	}
	
}
//main class
public class LibraryManagement {
	public static void main(String[] args) {
		Book b1=new Author("The Alchemist",1988,"Paulo Coelho","The Alchemist is a philosophical novel that follows the journey of Santiago, a young shepherd who dreams of discovering treasure.");
		b1.displayInfo();
	}
}
