import java.util.*;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking user input of height and base
		System.out.print("Enter height in cm ");
        double height=sc.nextDouble();
        System.out.print("Enter base in cm ");
        double base=sc.nextDouble();

        // Area in square centimeters
        double areaInSqCm= 0.5*base*height;

        // Convert area to square inches
        double areaInSqInches= areaInSqCm/6.4516;
        
        System.out.printf("Area of triangle in sq cm is %.2f and in sq inches is %.2f", areaInSqCm ,areaInSqInches);
	}

}
