package scenario_based;
import java.util.*;
public class OnlineQuizPlatform {
	public static void main(String[] args) {
		//scanner class
		Scanner sc=new Scanner(System.in);
		//correct answers
		String[] correctAnswers= {"a","b","a","b","c","a","b","b","b","a"};
		//userAnswers
		String[] userAnswers=new String[10];
		System.out.println("Enter your answers : ");
		for(int i=0;i<userAnswers.length;i++) {
			userAnswers[i]=sc.next();
		}
		//function call and output
		System.out.println("-------------------------------------------");
		int score=calculateScore(correctAnswers,userAnswers);
		System.out.println("Score is : "+score);
		char grade=findGrades(score);
		System.out.println("Grades are : "+grade);
		if(grade=='A') {
			System.out.println("Congratulations! You scored good marks");
		}
		else if(grade=='B') {
			System.out.println("Oh! You ate one mark");
		}
		else if(grade=='C') {
			System.out.println("Well done");
		}
		else if(grade=='D') {
			System.out.println("Keep it up bro , you are doing great");
		}
		else if(grade=='E') {
			System.out.println("Atleast you are paas , so be happy");
		}
		else {
			System.out.println("Study hard because you are fail in this test");
		}
	}
	//method to find grades
	public static char findGrades(int score) {
		switch(score) {
		case 10: return 'A';
        case 9: return 'A';
        case 8: return 'B';
        case 7: return 'C';
        case 6: return 'D';
        case 5 : return 'E';
        default: return 'F';	
		}
	}
    //method to calculate scores	
	public static int calculateScore(String[] correctAnswers,String[] userAnswers) {
		int score=0;
		for(int i=0;i<correctAnswers.length;i++) {
			 if(correctAnswers[i].equals(userAnswers[i])) score++;
		}
		return score;
	}
}
