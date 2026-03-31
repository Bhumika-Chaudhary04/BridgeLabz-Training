package sorting_algorithms;

import java.util.*;

class HeapSort {

	//heapify function to maintain max heap property
	static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[left] > arr[largest])
			largest = left;

		if (right < n && arr[right] > arr[largest])
			largest = right;

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			heapify(arr, n, largest);
		}
	}

	//heap Sort function
	static void heapSort(int[] arr) {
		int n = arr.length;

		//build Max Heap
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		//extract elements from heap
		for (int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] scores = new int[n];
		System.out.println("Enter salary : ");
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println("Salary before sorting :");
		display(scores);
		heapSort(scores);
		System.out.println("Salary after sorting : ");
		display(scores);
	}
	//method to display salary
	public static void display(int[] arr) {
		//traversing on the salary array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
