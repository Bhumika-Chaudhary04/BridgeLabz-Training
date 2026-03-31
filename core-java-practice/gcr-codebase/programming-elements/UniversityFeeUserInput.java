import java.util.*;
public class UniversityFeeUserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter fee ");
		int fee=sc.nextInt();
		System.out.print("Enter Discount ");
		int discountPercent=sc.nextInt();
//		calculating discount using discountPercent
		double discount=(fee*discountPercent)/100;
		double discountedFee=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and the final discounted fee is INR "+discountedFee);
		
		
	}
}
