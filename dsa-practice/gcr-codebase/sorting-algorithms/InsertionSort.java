package sorting_algorithms;

import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter employee id's : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Employee id's before sorting :");
		//method calls
		display(arr);
		insertionSort(arr);
		System.out.println("Employee id's after sorting : ");
		display(arr);

	}
	//method to sort employee IDs
	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	//method to display employee IDs
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
