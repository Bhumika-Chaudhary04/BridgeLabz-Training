import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		taking user inputs of n1 and n2
		System.out.print("Enter first number ");
	    float n1=sc.nextFloat();
	    System.out.print("Enter second number ");
	    float n2=sc.nextFloat();
	    float addResult=n1+n2;  //addition
	    float subResult=n1-n2;  //subtraction
	    float mulResult=n1*n2;  //multiplication
	    float divResult=n1/n2;  //division
	    System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.3f and %.2f is %.2f , %.2f , %.2f and %.2f" , n1 ,n2 , addResult,subResult,mulResult,divResult);
     }

}
