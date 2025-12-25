package methods;
import  java.util.*;
public class ShortestTallestNMeanHeight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] heightArr=new double[11];
		// input using random function
		for(int i=0;i<11;i++) {
			heightArr[i]=Math.random()*(250-150+1)+150;
		}
		//printing heights on the console
		System.out.println("Height of 11 players are: ");
		for(double i : heightArr) {
			System.out.print(i+" ");
		}
		//function call
		double shortestHeight=findShortestHeight(heightArr);
		double tallestHeight=findTallestHeight(heightArr);
		double meanHeight=findMean(heightArr);
		//output
		System.out.println("Shortesy Height in the team : "+shortestHeight);
		System.out.println("Tallest Height in the team : "+tallestHeight);
		System.out.println("Mean Height of the team is : "+meanHeight);
		
		
	}
	//function to find sum of heights
	public static double findSum(double[] heightArr) {
		double sum=0;
		for(double i:heightArr) {
			sum+=i;
		}
		return sum;
		
	}
	//function to find mean height
	public static double findMean(double[] heightArr) {
		double sum=findSum(heightArr);
		return sum/heightArr.length;
	}
	//function to find shortest height
	public static double findShortestHeight(double[] heightArr) {
		double ans=Double.MAX_VALUE;
		for(double i:heightArr) {
			if(i<ans) {
				ans=i;
			}
		}
		return ans;
	}
	//function to find tallest height
	public static double findTallestHeight(double[] heightArr) {
		double ans=Double.MIN_VALUE;
		for(double i:heightArr) {
			if(i>ans) {
				ans=i;
			}
		}
		return ans;
	}
}
