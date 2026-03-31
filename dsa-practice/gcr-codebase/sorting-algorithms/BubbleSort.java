package sorting_algorithms;

import java.util.*;

public class BubbleSort {
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int[] scores = new int[n];
		System.out.println("Enter marks of  the students : ");
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println("Scores before sorting :");
		display(scores);
		bubbleSort(scores);
		System.out.println("Scores after sorting : ");
		display(scores);

	}
	//bubble sort
	public static void bubbleSort(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length - i - 1; j++) {
				if (scores[j] > scores[j + 1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
				}
			}
		}

	}
	//method to display scores
	public static void display(int[] arr) {
		//traversing on the scores array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
