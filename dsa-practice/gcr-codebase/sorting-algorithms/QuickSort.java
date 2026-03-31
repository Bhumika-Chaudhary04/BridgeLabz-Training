package sorting_algorithms;

import java.util.Scanner;

public class QuickSort {

	// quick Sort method
	public static void quickSort(int[] prices, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(prices, low, high);

			// recursively sort left and right partitions
			quickSort(prices, low, pivotIndex - 1);
			quickSort(prices, pivotIndex + 1, high);
		}
	}

	// partition method
	public static int partition(int[] prices, int low, int high) {
		double pivot = prices[high]; // last element as pivot
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (prices[j] <= pivot) {
				i++;
				// swap prices[i] and prices[j]
				int temp = prices[i];
				prices[i] = prices[j];
				prices[j] = temp;
			}
		}

		// place pivot at correct position
		int temp = prices[i + 1];
		prices[i + 1] = prices[high];
		prices[high] = temp;

		return i + 1;
	}

	// main method with user input
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of products: ");
		int n = sc.nextInt();

		int[] prices = new int[n];

		System.out.println("Enter product prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		quickSort(prices, 0, n - 1);

		System.out.println("\nSorted Product Prices (Ascending Order):");
		for (int price : prices) {
			System.out.print(price + " ");
		}

		sc.close();
	}
}
