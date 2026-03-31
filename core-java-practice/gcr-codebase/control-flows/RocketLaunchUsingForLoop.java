package control_flows;
import java.util.*;
public class RocketLaunchUsingForLoop {
	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //input
        System.out.print("Enter countdown starting number: ");
        int counter = sc.nextInt();
        // Countdown using for loop
        for(int i=counter;i>0;i--){
            System.out.println(i);
        }
    }
}
