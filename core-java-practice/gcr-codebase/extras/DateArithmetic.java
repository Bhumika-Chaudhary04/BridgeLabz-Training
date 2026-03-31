package extras;
import java.time.*;
public class DateArithmetic {
	public static void main(String[] args) {
		//current date and time
		LocalDate date=LocalDate.now();
		System.out.println("Current Date : "+date);
		//arithmetic operations on date
		date=date.plusDays(7).plusMonths(1).plusYears(2);
		date=date.minusWeeks(3);
		System.out.println("Updated Date : "+date);
	}
}
