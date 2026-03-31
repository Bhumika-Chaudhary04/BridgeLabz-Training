package dsa_leetcode;

public class ValidPerfectSquare {
	public static void main(String[] args) {
		int num = 16; // change input here

		boolean result = isPerfectSquare(num);
		System.out.println(result);
	}

	public static boolean isPerfectSquare(int num) {
		if (num < 1)
			return false;

		long left = 1;
		long right = num;

		while (left <= right) {
			long mid = left + (right - left) / 2;
			long square = mid * mid;

			if (square == num) {
				return true;
			} else if (square < num) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}
}
