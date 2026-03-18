package scenario-based;
import java.util.*;
public class CorporateEmailAccessControl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String str=sc.nextLine();
			if(str.matches("[a-z]{3,}\\.[a-z]{3,}[0-9]{4,}@(sales|marketing|IT|product)\\.company\\.com")) {
				System.out.println("Access Granted");
			}
			else {
				System.out.println("Access Denied");
			}
		}
		
	}
}
