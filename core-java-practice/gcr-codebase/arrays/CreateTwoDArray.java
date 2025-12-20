package arrays;
import java.util.*;
public class CreateTwoDArray {
	public static void main(String[] args) {
        //scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter number of rows: ");
		int rows=sc.nextInt();
		System.out.print("Enter number of columns: ");
		int columns=sc.nextInt();
		int[][] twoDArr=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				twoDArr[i][j]=sc.nextInt();
			}
		}
		//logic
		int[] oneDArr=new int[rows*columns];
		int index=0;
		 // Copying elements from 2D array to 1D array
        for(int i=0;i<rows;i++) { // Outer loop for rows
            for (int j=0;j<columns;j++) { // Inner loop for columns
                oneDArr[index]=twoDArr[i][j];
                index++;
            }
        }
        // Displaying 1D array
        System.out.println("Elements in 1D array:");
        for (int i=0;i<oneDArr.length;i++) {
            System.out.print(oneDArr[i] + " ");
        }

        // Closing scanner
        sc.close();
		
	}

}
