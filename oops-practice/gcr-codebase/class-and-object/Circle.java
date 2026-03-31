package class_and_object;
public class Circle {
    private double radius;
    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }
    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.printf("Area of circle: %.4f%n", calculateArea());
        System.out.printf("Circumference of circle: %.4f%n", calculateCircumference());
    }
}

// Main class to test Circle
class DisplayCircleDetails {
    public static void main(String[] args) {
        // Creating Circle object
        Circle circle = new Circle(2.5);
        circle.displayDetails();
    }
}
