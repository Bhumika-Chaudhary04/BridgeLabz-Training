package strings;
import java.util.Scanner;
public class NumberFormatExceptionHandle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = sc.nextLine();
		// Method call that generates exception
		try {
			generateException(text);
		} catch (Exception e) {
			System.out.println("Exception caught in main: " + e);
		}
		// Method call that handles exception
		handleException(text);
		sc.close();
	}

	// Method to generate NumberFormatException
	public static void generateException(String text) {
		// This will throw NumberFormatException if text is not numeric
		int number = Integer.parseInt(text);
		System.out.println("Parsed number: " + number);
	}

	// Method to handle NumberFormatException
	public static void handleException(String text) {
		try {
			int number = Integer.parseInt(text);
			System.out.println("Parsed number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occurred! Exception Message: " + e.getMessage());
		}
	}
}
