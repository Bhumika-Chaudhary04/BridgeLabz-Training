public class RearrangeSticks {

    // MOD value to prevent overflow
    private static final int MOD = 1_000_000_007;

    // DP method to count ways
    public static int rearrangeSticks(int n, int k) {
        // dp[i][j] = ways to arrange i sticks with exactly j visible
        long[][] dp = new long[n + 1][k + 1];

        // base case: 0 sticks, 0 visible
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                // Case 1: tallest stick first
                dp[i][j] = dp[i - 1][j - 1] % MOD;

                // Case 2: tallest stick not first
                dp[i][j] += ((i - 1) * dp[i - 1][j]) % MOD;

                dp[i][j] %= MOD;
            }
        }

        return (int) dp[n][k];
    }

    // Main method to test
    public static void main(String[] args) {
        int n1 = 3, k1 = 2;
        System.out.println("Number of arrangements (Test 1): " + rearrangeSticks(n1, k1));
        // Expected: 3

        int n2 = 5, k2 = 5;
        System.out.println("Number of arrangements (Test 2): " + rearrangeSticks(n2, k2));
        // Expected: 1

        int n3 = 5, k3 = 1;
        System.out.println("Number of arrangements (Test 3): " + rearrangeSticks(n3, k3));
        // Expected: 24
    }
}