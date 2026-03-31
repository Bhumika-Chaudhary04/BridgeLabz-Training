package inheritance;
// Base class
class Course {
    String courseName;
    int duration; // in hours
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
// Level 1 subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}
// Level 2 subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidOnlineCourse(String courseName, int duration, String platform,boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + (fee - (fee * discount / 100)));
    }
}

// Main class
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course c1 = new Course("Object-Oriented Programming", 40);
        Course c2 = new OnlineCourse("Java Basics", 30, "Coursera", true);
        Course c3 = new PaidOnlineCourse("Advanced Java", 50, "Udemy", true, 5000, 20);
        System.out.println("----- Course 1 -----");
        c1.displayCourseDetails();
        System.out.println("\n----- Course 2 -----");
        c2.displayCourseDetails();
        System.out.println("\n----- Course 3 -----");
        c3.displayCourseDetails();
    }
}
