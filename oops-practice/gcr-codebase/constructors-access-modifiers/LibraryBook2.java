package constructors_access_modifiers;
public class LibraryBook2 {
    //attributes
    public String ISBN;       
    protected String title;   
    private String author;    
    //setter method for private author
    public void setAuthor(String author) {
        this.author = author;
    }
    //getter method for private author
    public String getAuthor() {
        return author;
    }
    //method to display complete book details
    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------------------");
    }
}
//subclass
class EBook extends LibraryBook2 {
    //accessing inherited ISBN & title
    void showDetails() {
        System.out.println("EBook Access → " + ISBN + " | " + title);
    } 
    public static void main(String[] args) {
        EBook e = new EBook();
        e.ISBN = "BK101";                
        e.title = "Java Programming";   
        e.setAuthor("James Gosling");    
        e.display();
        e.showDetails();
    }
}