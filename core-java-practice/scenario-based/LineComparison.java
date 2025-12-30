package scenario_based;
import java.util.*;
public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program\n");
		Scanner sc=new Scanner(System.in);
		//use case 1: Calculate length of a line using co-ordinates of x,y
		//user input 
		System.out.print("Enter x1 : ");
		int x1=sc.nextInt();
		System.out.print("Enter y1 : ");
		int y1=sc.nextInt();
		System.out.print("Enter x2 : ");
		int x2=sc.nextInt();
		System.out.print("Enter y2 : ");
		int y2=sc.nextInt();
		//computation
		Double lengthOfLineOne=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.printf("Length of the line 1 is : %.2f\n",lengthOfLineOne);
		
		System.out.print("Enter x3 : ");
		int x3=sc.nextInt();
		System.out.print("Enter y3 : ");
		int y3=sc.nextInt();
		System.out.print("Enter x4 : ");
		int x4=sc.nextInt();
		System.out.print("Enter y4 : ");
		int y4=sc.nextInt();
		//computation
		Double lengthOfLineTwo=Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		System.out.printf("Length of the line 2 is : %.2f\n",lengthOfLineTwo);
				
		//use case 2:compare lengths of two lines
		if(lengthOfLineOne.equals(lengthOfLineTwo)) {
			System.out.println("Both lines are of equal length");
		}
		else {
			System.out.println("Lines are not of equal length");
		}
		
	}
}
