package extras;
import java.util.Scanner;
public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        // Call method to take input from user
        int[] nums = takeInput();
        // Call method to find maximum of three numbers
        int max = findMaximum(nums[0], nums[1], nums[2]);
        // Display the maximum number
        System.out.println("Maximum number: " + max);
    }
    // Method to take three integer inputs from the user
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // Method to find the maximum of three integers
    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2,num3));
    }
}
