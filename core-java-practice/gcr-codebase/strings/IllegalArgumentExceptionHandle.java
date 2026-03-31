package strings;
import java.util.*;
public class IllegalArgumentExceptionHandle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		try {
			generateException(str);
		} catch (Exception e) {
			System.out.println("Exception caught in main: " + e);
		}
		handleException(str);

		sc.close();
	}

	//Method to generate IllegalArgumentException
	public static void generateException(String str) {
		String sub = str.substring(5, 2);   // This will throw StringIndexOutOfBoundsException
		System.out.println(sub);
	}

	//Method to handle IllegalArgumentException / RuntimeException
	public static void handleException(String str) {
		try {
			String sub = str.substring(5, 2);   // Invalid indices
			System.out.println(sub);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("IllegalArgumentException occurred (start index > end index)");
			System.out.println("Exception Message: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Some other runtime exception caught: " + e);
		}
	}
}
