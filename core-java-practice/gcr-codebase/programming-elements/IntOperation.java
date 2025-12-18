import java.util.*;
public class IntOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n1: ");
		int a=sc.nextInt(); //user input of first number 
		System.out.print("Enter n2: ");
		int b=sc.nextInt(); //user input of second number
		System.out.print("Enter n3: ");
		int c=sc.nextInt(); //user input of third number
		int o1=a+b*c;
		int o2=a*b+c;
		int o3=c+a/b;
		int o4=a%b+c;
		System.out.println("The results of o1 is "+o1 +" o2 is "+o2+" o3 is "+o3+" o4 is "+o4);
	}

}
