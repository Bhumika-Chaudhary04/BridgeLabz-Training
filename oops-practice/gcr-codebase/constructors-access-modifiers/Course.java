package constructors_access_modifiers;
public class Course {
    // instance variables
    private String courseName;
    private int duration;     // duration in weeks
    private double fee;
    //class variable (shared among all courses)
    private static String instituteName = "GLA University";
    //constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    //instance method
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " weeks");
        System.out.println("Course Fee     : " + fee);
        System.out.println("-----------------------------------");
    }
    //class method (static method)
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
    //main method for testing
    public static void main(String[] args) {
        Course c1=new Course("Java Full Stack",54,45000);
        Course c2=new Course("Python Data Science",50,50000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        // updating institute name
        Course.updateInstituteName("St C.f. Andrews School");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
