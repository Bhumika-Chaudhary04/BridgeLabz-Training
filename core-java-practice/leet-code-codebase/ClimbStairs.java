import java.util.*;
public class climbStairs {
    
    // main function 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of stairs");
        int n=sc.nextInt();
        System.out.println(climb(n));
    }

    // recursive function to find number of distinct ways to climb the stairs
    public static int climb(int n){

        // base case
        if(n==1 || n==2){
            return  n;
        }

        // recursive call
        return climb(n-1)+climb(n-2);
    }

    
}
