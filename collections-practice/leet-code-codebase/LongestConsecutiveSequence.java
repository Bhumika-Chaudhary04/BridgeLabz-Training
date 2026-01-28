package collections_leetcode;
import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Add elements to HashSet
        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;

        // Check for sequence start
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int current = n;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}
