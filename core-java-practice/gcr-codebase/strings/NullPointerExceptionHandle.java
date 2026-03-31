package strings;
import java.util.*;
public class NullPointerExceptionHandle {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//method call to generate Exception
        //generateException();
		try {
			generateException();
		} catch (Exception e) {
			System.out.println("Exception caught in main: " + e);
		}
		//method call to handle exception
		handleException();
		
		
		
	}
	public static void generateException() {
		String text=null;
		System.out.println(text.length());
	}
	public static void handleException() {
		String text=null;
		try {
			System.out.println(text.length());
		}
		catch(NullPointerException e){  //caught exception
			System.out.println("Null Pointer Exception : "+ e.getMessage());
		}
	}

}
