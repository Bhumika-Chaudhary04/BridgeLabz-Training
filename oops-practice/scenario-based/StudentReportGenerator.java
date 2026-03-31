package scenario_based;
import java.util.*;
//custom exception
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
//student class
class Student {
    private String name;
    private String[] subjects;
    private int[] marks;
    public Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        validateMarks();
    }
    //function to validate marks
    private void validateMarks() throws InvalidMarkException {
        for (int mark : marks) {
            if (mark<0 || mark>100) {
                throw new InvalidMarkException("Marks must be between 0 and 100.");
            }
        }
    }
    //function to calculate average
    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    //function to assign grade
    public char assignGrade() {
        int avg = (int) calculateAverage();
        switch (avg / 10) {
            case 10:
            case 9: return 'A';
            case 8: return 'B';
            case 7: return 'C';
            case 6: return 'D';
            default: return 'F';
        }
    }
    //function to display report
    public void displayReport() {
        System.out.println("\nReport Card");
        System.out.println("Student Name : " + name);
        System.out.println("---------------------------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-10s : %3d%n", subjects[i], marks[i]);
        }
        System.out.println("---------------------------");
        System.out.printf("Average     : %.2f%n", calculateAverage());
        System.out.println("Grade       : " + assignGrade());
    }
}
//Student Report Generator
public class StudentReportGenerator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        //try block
        try {
            students.add(new Student("Alice",new String[]{"Math", "Science", "English"},new int[]{85, 90, 88}));
            students.add(new Student("Bob",new String[]{"Math", "Science", "English"},new int[]{72, 65, 70}));
            // Invalid marks test
            students.add(new Student("Charlie",new String[]{"Math", "Science", "English"},new int[]{95, 110, 80}));

        }
        //catch block
        catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }
        // Display reports
        for (Student s : students) {
            s.displayReport();
        }
    }
}

