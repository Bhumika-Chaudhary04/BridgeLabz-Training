import java.util.*;
public class MaximumNoOfHandshakes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students ");
        int numOfStudents=sc.nextInt();

        // Calculate maximum number of handshakes
        int handshakes=(numOfStudents*(numOfStudents-1))/2;

        // Output
        System.out.println("Maximum number of possible handshakes are " + handshakes);
	}

}
