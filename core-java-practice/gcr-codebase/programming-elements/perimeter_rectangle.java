import java.util.*;
public class perimeter_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");
        double length=sc.nextDouble();

        System.out.println("Enter width");
        double width=sc.nextDouble();

        // calculating perimeter of rectangle
        double perimeter=2*(length + width);
        System.out.println("Perimeter of Rectangle" + perimeter);
    }
    
}
