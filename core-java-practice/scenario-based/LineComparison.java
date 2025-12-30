package scenario_based;
import java.util.*;
public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc=new Scanner(System.in);
		//use case 1: Calculate length of a line using co-ordinates of x,y
		//user input of co-ordiantes of x and y
		System.out.print("Enter x1 : ");
		int x1=sc.nextInt();
		System.out.print("Enter y1 : ");
		int y1=sc.nextInt();
		System.out.print("Enter x2 : ");
		int x2=sc.nextInt();
		System.out.print("Enter y2 : ");
		int y2=sc.nextInt();
		//computation
		double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.printf("Length of the line is : %.2f",length);
	}
}
