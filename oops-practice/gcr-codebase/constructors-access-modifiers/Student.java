package constructors_access_modifiers;
public class Student {
	//attributes
    public int rollNumber;       // public
    protected String name;       // protected
    private double cgpa;         // private
    //encapsulation
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
    public double getCGPA() {
        return cgpa;
    }
    //method to display student details
    void display() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("----------------------------------");
    }
}
//subclass
class PostgraduateStudent extends Student {
    void showName() {
        System.out.println("Student Name (Protected): " + name);
    }
    public static void main(String[] args) {
        PostgraduateStudent s=new PostgraduateStudent();
        s.rollNumber = 101;
        s.name = "Priya";
        s.setCGPA(9.2);
        s.display();
        s.showName();
    }
}