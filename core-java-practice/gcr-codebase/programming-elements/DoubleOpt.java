import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n1: ");
		double a=sc.nextInt(); //user input of first number 
		System.out.print("Enter n2: ");
		double b=sc.nextInt(); //user input of second number
		System.out.print("Enter n3: ");
		double c=sc.nextInt(); //user input of third number
		//calculation
		double o1=a+b*c;
		double o2=a*b+c;
		double o3=c+a/b;
		double o4=a%b+c;
        //output
		System.out.printf("The results of o1 is %.2f o2 is %.2f o3 is %.2f o4 is %.2f",o1,o2,o3,o4);
	}

}
