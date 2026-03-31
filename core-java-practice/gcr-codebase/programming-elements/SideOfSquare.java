import java.util.*;
public class SideOfSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		user input of perimeter
		double perimeter=sc.nextDouble();
//		calculating length of one side
		double lside=perimeter/4;
		System.out.println("The length of the side is "+lside+" whose perimeter is "+perimeter);
	}

}
