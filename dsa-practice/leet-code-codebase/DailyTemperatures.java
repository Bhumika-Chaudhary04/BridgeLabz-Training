package dsa_leetcode;

import java.util.*;

class DailyTemperatures {

	public static int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>(); // stores indices

		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
				int idx = st.pop();
				ans[idx] = i - idx;
			}
			st.push(i);
		}
		return ans;
	}

	// main method
	public static void main(String[] args) {

		int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] result = dailyTemperatures(temperatures);

		System.out.println("Days to wait for a warmer temperature:");
		System.out.println(Arrays.toString(result));
	}
}
