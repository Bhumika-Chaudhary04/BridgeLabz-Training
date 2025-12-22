package strings;
import java.util.*;
public class RockPaperScissors {
    // Method to generate computer choice using Math.random()
    public static String getComputerChoice() {
        int choice=(int)(Math.random()*3); // 0,1,2
        if(choice==0) return "rock";
        if(choice==1) return "paper";
        return "scissors";
    }

    // Method to find winner of one game
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    // Method to calculate wins and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats=new String[2][3];
        double userPercent=(userWins*100.0)/games;
        double computerPercent=(computerWins*100.0)/games;
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent) + "%";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                               gameResults[i][0] + "\t" +
                               gameResults[i][1] + "\t\t" +
                               gameResults[i][2]);
        }

        System.out.println("\nOverall Statistics:");
        System.out.println("Player\tWins\tWin Percentage");
        System.out.println("--------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                               stats[i][1] + "\t" +
                               stats[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        String[][] results = new String[games][3];
        int userWins=0,computerWins=0;
        for (int i=0;i<games;i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice=sc.next().toLowerCase();
            String computerChoice=getComputerChoice();
            String winner=findWinner(userChoice,computerChoice);
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;
            results[i][0]=userChoice;
            results[i][1]=computerChoice;
            results[i][2]=winner;
        }

        String[][] stats=calculateStats(userWins, computerWins, games);
        displayResults(results, stats);
        sc.close();
    }
}
