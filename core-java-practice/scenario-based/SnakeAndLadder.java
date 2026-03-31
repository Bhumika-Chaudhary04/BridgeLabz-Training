package scenario_based;
import java.util.*;
public class SnakeAndLadder {
    public static void main(String[] args) {
        // Use Case-7: Two players start at position 0
        int player1Position=0;
        int player2Position=0;
        int finalPosition=10;
        int diceRolled=0;
		//Use Case 1 : Game starts with a single player at position 1
        boolean isPlayerOneTurn = true;
        Random random = new Random();
        System.out.println("------Welcome to Snake & Ladder Simulator (2 Players)------");
        System.out.println("Player 1 starts at position "+player1Position);
        System.out.println("Player 2 starts at position "+player2Position);
        System.out.println("-----------------------------------------------------------");
        // Play until one player wins
        //Use case 4 : Repeat till the player reaches the winning position 100
        while (player1Position<finalPosition && player2Position<finalPosition) {
    		//Use Case 2 : Player rolls the dice to get a number between 1 to 6.
            int dice=random.nextInt(6)+1;
            diceRolled++;
            int option=random.nextInt(3); // 0-No Play, 1-Ladder, 2-Snake
            if (isPlayerOneTurn) {
            	//Use case 3 : Player checks for the options between no play , ladder or snake
                System.out.println("\nPlayer 1 rolled and got : " + dice);
                if (option == 0) {
                    System.out.println("Option : No Play");
                } else if (option == 1) {
                    System.out.println("Option : Ladder");
    				//Use Case 5 :Player gets the exact winning position
                    if (player1Position + dice <= finalPosition) {
                        player1Position += dice;
                    }
                } else {
                    System.out.println("Option : Snake");
                    player1Position -= dice;
                    if (player1Position < 0) {
                        player1Position = 0;
                    }
                }
                System.out.println("Player 1 Position : " + player1Position);
                // Ladder → same player plays again
                if (option != 1) {
                    isPlayerOneTurn = false;
                }
            } 
            else {
            	//Use case 3 : Player checks for the options between no play , ladder or snake
                System.out.println("\nPlayer 2 rolled and got: " + dice);
                if (option == 0) {
                    System.out.println("Option : No Play");

                } else if (option == 1) {
                    System.out.println("Option : Ladder");
    				//Use Case 5 :Player gets the exact winning position
                    if (player2Position + dice <= finalPosition) {
                        player2Position += dice;
                    }

                } else {
                    System.out.println("Option : Snake");
                    player2Position -= dice;
                    if (player2Position < 0) {
                        player2Position = 0;
                    }
                }
                System.out.println("Player 2 Position : " + player2Position);
                if (option!=1) {
                    isPlayerOneTurn = true;
                }
            }

            System.out.println("-----------------------------------------------------------");
        }
        // Use Case-7: Declare Winner
        if (player1Position == finalPosition) {
            System.out.println("PLAYER 1 WON THE GAME!");
        } 
        else {
            System.out.println("PLAYER 2 WON THE GAME!");
        }
      //Use Case 6 : Reporting number of times dice was rolled to finally win the game
        System.out.println("Total dice rolled : "+diceRolled);
    }
}
