package dsa_leetcode;

import java.util.*;

class NextGreaterElement {

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> st = new Stack<>();

		// process nums2 to find next greater elements
		for (int i = nums2.length - 1; i >= 0; i--) {
			map.put(nums2[i], -1);

			while (!st.isEmpty()) {
				if (st.peek() > nums2[i]) {
					map.put(nums2[i], st.peek());
					break;
				} else {
					st.pop();
				}
			}
			st.push(nums2[i]);
		}

		// build answer for nums1
		for (int i = 0; i < nums1.length; i++) {
			ans[i] = map.get(nums1[i]);
		}

		return ans;
	}

	// main method
	public static void main(String[] args) {

		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };

		int[] result = nextGreaterElement(nums1, nums2);

		System.out.println("Next Greater Elements:");
		for (int x : result) {
			System.out.print(x + " ");
		}
	}
}
