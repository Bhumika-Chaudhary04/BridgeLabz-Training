public class MaximumPointsFromCards {

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int num : cardPoints) {
            total += num;  // sum of all cards
        }

        // If we take all cards
        if (k == n) return total;

        int windowSize = n - k;
        int windowSum = 0;

        // initial sum of the first window
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        // slide the window
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return total - minWindowSum;  // max points = total - min sum of n-k subarray
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Test case 1
        int[] cardPoints1 = {1, 2, 3, 4, 5, 6, 1};
        int k1 = 3;
        System.out.println("Maximum points (Test 1): " + maxScore(cardPoints1, k1));
        // Expected output: 12

        // Test case 2
        int[] cardPoints2 = {2, 2, 2};
        int k2 = 2;
        System.out.println("Maximum points (Test 2): " + maxScore(cardPoints2, k2));
        // Expected output: 4

        // Test case 3
        int[] cardPoints3 = {9, 7, 7, 9, 7, 7, 9};
        int k3 = 7;
        System.out.println("Maximum points (Test 3): " + maxScore(cardPoints3, k3));
        // Expected output: 55
    }
}