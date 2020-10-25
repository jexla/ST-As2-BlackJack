package nz.ac.eit.blackjack;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        boolean playAgain = true;
        while (playAgain)
        {
            // initialize variables
            Scanner scanner = new Scanner(System.in);
            InputCollector ic = new InputCollector();
            Game g = new Game();
            Human h = new Human();
            AI ai = new AI();

            System.out.println("Welcome to Blackjack!");

            // human
            h.playFirstRoll();
            System.out.println("You roll 2 dice and get " + h.getScore());
            boolean playerRollAgain = false;
            boolean playerMadeChoice = false;
            while (!playerMadeChoice)
            {
                try
                {
                    System.out.print("Roll again? Y/N: ");
                    playerRollAgain = ic.collectYesOrNo(scanner.nextLine());
                    playerMadeChoice = true;
                }
                catch (InputNotYesOrNoException e)
                {
                    System.out.println("Invalid option: " + e.getText());
                }
            }
            if (playerRollAgain)
            {
                System.out.println("You roll 2 dice and get " + h.playSecondRoll());
            }
            System.out.println("Total: " + h.getScore());

            // AI
            System.out.println();
            ai.playFirstRoll();
            System.out.println("The AI rolls 2 dice and gets " + ai.getScore());
            int aiSecondRoll = ai.playSecondRoll();
            if (aiSecondRoll > -1)
            {
                System.out.println("The AI rolls 2 dice again and gets " + aiSecondRoll);
            }
            else
            {
                System.out.println("The AI chooses not to roll again");
            }
            System.out.println("Total: " + ai.getScore());

            // decide winner
            System.out.println();
            int winner = g.decideWinner(h.getScore(), ai.getScore());
            switch (winner)
            {
                case -1: System.out.println("AI wins!"); break;
                case 0: System.out.println("Draw!"); break;
                case 1: System.out.println("You win!"); break;
            }
            System.out.println("Player total: " + h.getScore());
            System.out.println("AI total: " + ai.getScore());

            // exit
            playerMadeChoice = false;
            while (!playerMadeChoice)
            {
                try
                {
                    System.out.print("Play again? Y/N: ");
                    playAgain = ic.collectYesOrNo(scanner.nextLine());
                    playerMadeChoice = true;
                    System.out.println();
                }
                catch (InputNotYesOrNoException e)
                {
                    System.out.println("Invalid option: " + e.getText());
                }
            }
        }
    }
}
