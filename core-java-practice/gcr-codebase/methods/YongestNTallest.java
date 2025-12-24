package methods;
import java.util.*;
public class YongestNTallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		int[] ages=new int[3];
		int[] heights=new int[3];
		System.out.println("Enter ages of all 3 friends : ");
		for(int i=0;i<3;i++) {
			ages[i]=sc.nextInt();
		}
		System.out.println("Enter height of all 3 friends : ");
		for(int i=0;i<3;i++) {
			heights[i]=sc.nextInt();
		}
		//function call
		String youngestFriend=youngest(ages);
		String tallestFriend=tallest(heights);
		//output
		System.out.println("Youngest friend is : "+youngestFriend);
		System.out.println("Tallest friend is : "+tallestFriend);
		
	}
	//method to find youngest friend
	public static String youngest(int[] ages) {
		if(ages[0]<ages[1] && ages[0]<ages[2]) {
			return "Amar";
		}
		else if(ages[1]<ages[0] && ages[1]<ages[2]) {
			return "Akbar";
		}
		else {
			return "Anthony";
		}
		
	}
	//method to find tallest friend
	public static String tallest(int[] heights) {
		if(heights[0]>heights[1] && heights[0]>heights[2]) {
			return "Amar";
		}
		else if(heights[1]>heights[0] && heights[1]>heights[2]) {
			return "Akbar";
		}
		else {
			return "Anthony";
		}
	}
}
