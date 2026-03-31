package arrays;
import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
    	//scanner object
        Scanner sc = new Scanner(System.in);
        // Array to store names of friends
        String[] names={"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height of friends
        int[] ages=new int[3];
        double[] heights=new double[3];

        // Taking input for age and height
        for (int i=0;i<3;i++) {
            System.out.println("\nEnter details for " +names[i]);

            System.out.print("Enter age: ");
            ages[i]=sc.nextInt();

            System.out.print("Enter height (in cm): ");
            heights[i]=sc.nextDouble();
        }

        // Initialize youngest and tallest using first friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {

            // Check for youngest friend
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Check for tallest friend
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        //output
        System.out.println("Youngest Friend: " + names[youngestIndex] +" (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        // Closing scanner
        sc.close();
    }
}
