import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter n
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // call function which will tell us if it is possible or not
        System.out.println(possible(n, arr));

    }

    public static boolean possible(int n, int[] arr) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < i) {
                return false;
            }
            max = Math.max(max, arr[i] + i);
        }
        return true;
    }

}
