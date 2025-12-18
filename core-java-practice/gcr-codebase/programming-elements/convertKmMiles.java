import java.util.*;
public class convertKmMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // taking input from users
        System.out.println("Enter distance in kms");
        double km = sc.nextDouble();

        // converting to miles
        double miles = km*0.621371;

        System.out.println("Distance in miles " + miles);

    }
    
}
