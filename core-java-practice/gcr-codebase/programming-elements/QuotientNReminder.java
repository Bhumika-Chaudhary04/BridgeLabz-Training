import java.util.*;
public class QuotientNReminder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int number1=sc.nextInt();  //user input
		System.out.print("Enter number 2 : ");
		int number2=sc.nextInt();  //user input
		int quotient=number1/number2;  //quotient calculation
		int reminder=number1%number2;  //reminder using modulo
		System.out.println("The Quotient is "+quotient +" Reminder is "+reminder +" of two number "+number1 +" and "+number2);
	}

}
