
public class UniversityFee {
	public static void main(String[] args) {
		int fee=125000;
		int discountPercent=10;
//		calculating discount using discountPercent
		double discount=(fee*discountPercent)/100;
		double discountedFee=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and the final discounted fee is INR "+discountedFee);
		
	}
}
