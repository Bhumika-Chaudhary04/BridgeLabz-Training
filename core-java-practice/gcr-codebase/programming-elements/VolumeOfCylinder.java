import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.println("Enter radius");
        double r=sc.nextDouble();

        System.out.println("Enter height");
        double h=sc.nextDouble();

        // calculating volume of cylinder

        double volume=Math.PI * r*r*h;
        System.out.println("Volume of Cylinder is " + volume);
    }
    
}
