package sorting_algorithms;

import java.util.Arrays;

public class CountingSort {

	public static void countingSort(int[] ages) {
		int minAge = 10;
		int maxAge = 18;

		int range = maxAge - minAge + 1;
		int[] count = new int[range];
		int[] output = new int[ages.length];

		// Step 1: Count frequency of each age
		for (int age : ages) {
			count[age - minAge]++;
		}

		// Step 2: Cumulative count
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// Step 3: Build output array (stable sort)
		for (int i = ages.length - 1; i >= 0; i--) {
			int age = ages[i];
			int index = age - minAge;
			output[count[index] - 1] = age;
			count[index]--;
		}

		// Step 4: Copy output to original array
		System.arraycopy(output, 0, ages, 0, ages.length);
	}

	public static void main(String[] args) {
		int[] ages = { 15, 12, 18, 10, 14, 12, 16, 11 };

		System.out.println("Before Sorting: " + Arrays.toString(ages));
		countingSort(ages);
		System.out.println("After Sorting: " + Arrays.toString(ages));
	}
}
