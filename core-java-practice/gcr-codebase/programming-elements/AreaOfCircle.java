import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // take radius input from user 
        System.out.println("Enter radius value");
        double r=sc.nextDouble();


        // calculating area of circle
        double area=Math.PI*r*r;
        System.out.println("Area of Circle is " + area);
    }
    
}
