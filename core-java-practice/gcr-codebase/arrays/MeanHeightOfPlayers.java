package arrays;
import java.util.*;
public class MeanHeightOfPlayers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] heights=new double[11];
		System.out.println("Enter heights of all 11 players of team : ");
		for(int i=0;i<heights.length;i++) {
			heights[i]=sc.nextDouble();
		}
		double sum=0.0;
		//finding sum of heights
		for(int i=0;i<heights.length;i++) {
			sum+=heights[i];
		}
		//calculating mean height using formula totalsum/size;
		double meanHeight=sum/11;
		//output
		System.out.printf("Mean Height of the football team of 11 players is : %.2f " ,meanHeight);
		
	}

}
