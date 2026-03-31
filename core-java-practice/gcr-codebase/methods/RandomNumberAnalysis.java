package methods;
import java.util.Arrays;
public class RandomNumberAnalysis {
	public static void main(String[] args) {
		// generate array of 5 random 4-digit numbers
		int[] numbers=generate4DigitRandomArray(5);
		System.out.println("Generated Numbers: " + Arrays.toString(numbers));
		// find average, min and max
		double[] result = findAverageMinMax(numbers);
		System.out.println("Average: " + result[0]);
		System.out.println("Minimum: " + result[1]);
		System.out.println("Maximum: " + result[2]);
	}

	// method to generate array of 4-digit random numbers
	public static int[] generate4DigitRandomArray(int size) {
		int[] arr=new int[size];
		for (int i=0;i<size;i++) {
			// generates numbers between 1000 and 9999
			arr[i]=(int)(Math.random()*9000)+1000;
		}
		return arr;
	}

	// method to find average, min and max
	public static double[] findAverageMinMax(int[] numbers) {
		int max=numbers[0];
		int min=numbers[0];
		int sum=0;
		for (int i=0; i<numbers.length;i++) {
			sum+=numbers[i];
			min=Math.min(min, numbers[i]);
			max=Math.max(max, numbers[i]);
		}
		double average=(double)sum/numbers.length;
		return new double[]{average,min,max };
	}
}
