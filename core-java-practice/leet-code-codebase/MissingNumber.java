import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // enter the size of array
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // create an aray of n+1 size
        int[] arr1=new int[n+1];
        for(int i=0;i<n;i++){
            arr1[arr[i]]=1;
        }
        for(int i=0;i<=n;i++){
            if(arr1[i]!=1){
                System.out.println(i);
            }
        }
    }
    
}
