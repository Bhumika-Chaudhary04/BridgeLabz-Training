import java.util.*;
public class prime_number {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // enter number  
    int n=sc.nextInt();
    // handling edge cases
    if(n<=1){
        System.out.println(false);
            return;
    }
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            System.out.println(false);
            return;
        }
    }
    System.out.println(true); 
    }
    
    
}
