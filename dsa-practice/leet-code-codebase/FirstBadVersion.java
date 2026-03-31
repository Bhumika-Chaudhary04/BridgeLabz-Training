package dsa_leetcode;

public class FirstBadVersion {

	// Simulated API (LeetCode provides this)
	static boolean isBadVersion(int version) {
		int firstBad = 4; // assume version 4 is first bad
		return version >= firstBad;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(firstBadVersion(n));
	}

	public static int firstBadVersion(int n) {
		int left = 1;
		int right = n;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (isBadVersion(mid)) {
				right = mid; // move left to find earlier bad
			} else {
				left = mid + 1; // move right
			}
		}
		return left;
	}
}
