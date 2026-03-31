package scenario-based;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;
public class GlobalShipmentManifestValidator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of testcases : ");
		int t=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter user input : ");
		while(t-- > 0) {
			String str=sc.nextLine();
			String[] arr=str.split("\\|");
			if(!arr[0].matches("SHIP-(?!.*(\\d)\\1\\1\\1)[1-9][0-9]{5}")) {
				System.out.println("NON-COMPLIANT RECORD");
				continue;
			}
			boolean validDate=true;
			try {
				LocalDate date=LocalDate.parse(arr[1]);
				int year=date.getYear();
				if(year<2000 || year>2099) validDate=false;	
			}
			catch(DateTimeParseException e) {
				validDate=false;
			}
			if(!validDate) {
				System.out.println("NON-COMPLIANT RECORD");
                continue;
			}
			if(!(arr[2].equals("AIR") || arr[2].equals("SEA") || arr[2].equals("ROAD")|| arr[2].equals("RAIL")|| arr[2].equals("EXPRESS")|| arr[2].equals("FREIGHT"))){
				System.out.println("NON-COMPLIANT RECORD");
				continue;

			}
			if(!arr[3].matches("^(0|[1-9]\\d{0,5})(\\.[0-9]{1,2})?$")) {
				System.out.println("NON-COMPLIANT RECORD");
				continue;

			}
			if(!(Double.parseDouble(arr[3])<=999999.99)) {
				System.out.println("NON-COMPLIANT RECORD");
				continue;

			}
			if(!(arr[4].equals("DELIVERED") || arr[4].equals("CANCELLED") || arr[4].equals("IN_TRANSIT"))) {
				System.out.println("NON-COMPLIANT RECORD");
				continue;

			}
			System.out.println("COMPLIANT RECORD");
		}
		
	}

}
