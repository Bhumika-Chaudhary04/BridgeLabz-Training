package exceptions;
import java.util.*;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class CustomException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age : ");
		int age=sc.nextInt();
		try {
			validateAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println("Invalid Age Exception "+e.getMessage());
		}	
	}
	public static void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or above.");
		}
		System.out.println("Access granted!");
	}
}
