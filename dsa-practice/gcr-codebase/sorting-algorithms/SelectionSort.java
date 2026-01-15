package sorting_algorithms;

import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// user input
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter scores of the students  : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Scores before sorting :");
		display(arr);
		selectionSort(arr);
		System.out.println("Scores after sorting : ");
		display(arr);
	}

	// method to sort scores using selection sort
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int k = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[k]) {
					k = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}

	// method to display scores
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
