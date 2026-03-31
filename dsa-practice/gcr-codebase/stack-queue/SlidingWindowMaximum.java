package stack_queue;

import java.util.*;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter window size : ");
		int k = sc.nextInt();
		List<Integer> result = slidingWindowMax(arr, k);
		System.out.println(result);
	}

	public static List<Integer> slidingWindowMax(int[] arr, int k) {
		List<Integer> result = new ArrayList<>();
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			//remove elements outside the window
			if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
				deque.pollFirst();
			}
			//remove smaller elements from the back
			while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
				deque.pollLast();
			}
			//add current index
			deque.offerLast(i);
			//add maximum to result
			if (i >= k - 1) {
				result.add(arr[deque.peekFirst()]);
			}
		}
		return result;
	}
}
