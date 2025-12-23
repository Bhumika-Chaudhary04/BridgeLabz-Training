package strings;
import java.util.*;
public class BMIStrings {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//input from user
		System.out.print("Enter number of students : ");
		int n=sc.nextInt();
		int[][] studentInfo=new int[n][2];
		//to take input of students weight and height
		for(int i=0;i<studentInfo.length;i++) {
			System.out.print("Enter height of "+(i+1)+" person in (cm)");
			studentInfo[i][0]=sc.nextInt();
			System.out.print("Enter weight of "+(i+1)+" person in (kg)");
			studentInfo[i][1]=sc.nextInt();
			System.out.println();		
		}
		//function call to calculate BMI 
		String[][] ans=statusNBMI(studentInfo);
		//function call to display the answer
		display(ans);
	}
	//function to calculate BMI
	public static String[][] calculateBMI(int[] info) {
		String[][] ans=new String[1][2];
			double heightInMeters=info[0]/100.0;
			double BMI=info[1]/(heightInMeters*heightInMeters);
			String status;
			if(BMI<=18.4) {
				status="Underweight";
			}
			else if(BMI>=18.5 && BMI<=24.9) {
				status="Normal";
			}
			else if(BMI>=25.0 && BMI<=39.9) {
				status="Overweight";
			}
			else {
				status="Obese";
			}
			ans[0][0]=String.valueOf(BMI);
			ans[0][1]=status;
		return ans;
	}
	//function to find status
	public static String[][] statusNBMI(int[][] studentInfo){
		String[][] ans=new String[studentInfo.length][4];
		for(int i=0;i<studentInfo.length;i++) {
			ans[i][0]=String.valueOf(studentInfo[i][0]);
			ans[i][1]=String.valueOf(studentInfo[i][1]);
			String[][] arr=calculateBMI(studentInfo[i]);
			ans[i][2]=arr[0][0];
			ans[i][3]=arr[0][1];
		}
		return ans;
	}
	//function to display the result
	public static void display(String[][] ans) {
		System.out.println("BMI Calculation");
		System.out.println("--------------------------------------------------------------------\n");
		System.out.println("Student\tHeight(in cm)\tWeight(in kg)\tBMI(kg/m^2) \t status");
		for(int i=0;i<ans.length;i++) {
			System.out.printf("%d\t%s\t\t%s\t\t%.2f\t\t%s\n",(i+1),ans[i][0],ans[i][1],Double.parseDouble(ans[i][2]),ans[i][3]);
		}
	}

}
