package strings;
import java.util.Scanner;
public class ArrayIndexOutOfExceptionHandle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n=sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] names = new String[n];
        // Take names input
        for (int i=0;i<n;i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(names);
        sc.close();
    }

    //Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] arr) {
        System.out.println("Accessing invalid index: " + arr[arr.length]);
    }

    //Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] arr) {
        try {
            // Access invalid index
            System.out.println("Accessing invalid index: " + arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Some other runtime exception caught: " + e);
        }
    }
}
