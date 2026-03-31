package methods;
import java.util.*;
public class OTPGenerator {
    public static void main(String[] args) {
        int[] otpArr = new int[10];
        // generate 10 OTPs
        for (int i=0;i<otpArr.length;i++) {
            otpArr[i]=generateOTP();
        }
        // print OTPs
        System.out.println("Generated OTPs:");
        System.out.println(Arrays.toString(otpArr));
        // check uniqueness
        boolean isUnique = checkUniqueOTP(otpArr);
        System.out.println("Are all OTPs unique? " + isUnique);
    }

    // Method to generate 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random()*900000)+100000;
    }

    // Method to check uniqueness of OTPs
    public static boolean checkUniqueOTP(int[] otpArr) {
        for (int i=0;i<otpArr.length;i++) {
            for (int j=i+1;j<otpArr.length;j++) {
                if (otpArr[i]==otpArr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
