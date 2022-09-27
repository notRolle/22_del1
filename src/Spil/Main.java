package Spil;

import Test.Die;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Initialiserer spiller 1 og 2. sum = antal points, roll = værdi af kast.
        int player1sum = 0, player2sum = 0;

        // Looper skiftevis kast, så begge spillere når at kaste lige mange gange
        while (player1sum < 40 || player2sum < 40){
            Scanner input = new Scanner(System.in);

            //implementerer terning
            Die die1 = new Die();
            Die die2 = new Die();

            //Spiller 1 kast
            int player1dice1 = die1.roll1();
            int player1dice2 = die2.roll1();
            int sum1 = player1dice1 + player1dice2;

            //Spiller 2 kast
            int player2dice1 = die1.roll1();
            int player2dice2 = die2.roll1();
            int sum2 = player2dice1 + player2dice2;

            //Spiller 1 tur
            System.out.println("________________________________________");
            System.out.println("Player 1! Hit ENTER to roll! ");
            String pause1 = input.nextLine(); //Indsat pause, så spiller 1 skal gøre noget for at kaste
            player1sum += sum1; // Tilføjer kast til sum
            System.out.println("You rolled "+player1dice1 + " and "+ player1dice2+". You gain "+sum1 + " points!"); //Printer kast og points
            System.out.println("You have " + player1sum + " points now!");

            //Spiller 2 tur
            System.out.println();
            System.out.println("________________________________________");
            System.out.println("Player 2! Hit ENTER to roll! ");
            String pause2 = input.nextLine();
            player2sum += sum2;
            System.out.println("You rolled "+player2dice1 + " and "+ player2dice2+". You gain "+ sum2 + " points!");
            System.out.println("You have " + player2sum + " points now!");
            System.out.println();


            //Checker om spiller 1 har vundet
            if (player1sum >= 40 && player2sum < 40) {
                System.out.println("Player 1 wins!!!");
                break;
            }
            //Checker om spiller 2 har vundet
            if (player2sum >= 40 && player1sum < 40) {
                System.out.println("Player 2 wins!!!");
                break;
            }

            //_____________________________________________________________________________________________
            //__________________________________HVIS BEGGE ER OVER 40 POINTS_______________________________
            //_____________________________________________________________________________________________

            //Checker om begge spillere har over 40 points
            if (player2sum >= 40 && player1sum >= 40) {
                //Spiller 1 kast
                player1dice1 = die1.roll1();
                player1dice2 = die2.roll1();
                sum1 = player1dice1 + player1dice2;

                //Spiller 2 kast
                player2dice1 = die1.roll1();
                player2dice2 = die2.roll1();
                sum2 = player2dice1 + player2dice2;

                System.out.println();
                System.out.println("Both players have over 40 points! ");

                //Spiller 1 kaster igen
                System.out.println("Player 1! Hit ENTER to roll");
                String pause3 = input.nextLine();
                System.out.println("Player 1 rolled "+ player1dice1 + " and " + player1dice2 + "! A total of " + sum1 + "!");
                System.out.println();

                //Spiller 2 kaster igen
                System.out.println("Player 2! Hit ENTER to roll");
                String pause4 = input.nextLine();
                System.out.println("Player 2 rolled "+ player2dice1 + " and " + player2dice2 + "! A total of " + sum2+ "!");
                System.out.println();

                //Checker hvem det slog det højeste slag, og dermed vinder
                if (sum1 > sum2){
                    System.out.println("Player 1 wins!!!");
                    break;
                }
                if (sum1 < sum2){
                    System.out.println("Player 2 wins!!!");
                    break;
                }

                //_____________________________________________________________________________________________
                //_____________________________HVIS DE SLÅR DET SAMME__________________________________________
                //_____________________________________________________________________________________________

                //Hvis de slog det samme, looper den indtil en vinder er fundet.
                while (sum1 == sum2){

                    //Spiller 1 kast
                    player1dice1 = die1.roll1();
                    player1dice2 = die2.roll1();
                    sum1 = player1dice1 + player1dice2;

                    //Spiller 2 kast
                    player2dice1 = die1.roll1();
                    player2dice2 = die2.roll1();
                    sum2 = player2dice1 + player2dice2;


                    //Spiller 1 kaster igen
                    System.out.println("The same? Roll again player 1! Hit ENTER");
                    String pause5 = input.nextLine();
                    System.out.println("Player 1 rolled "+ player1dice1 + " and " + player1dice2 + "! A total of " + sum1 + "!");
                    System.out.println();

                    //Spiller 2 kaster igen
                    System.out.println("Player 2! Hit ENTER to roll");
                    String pause6 = input.nextLine();
                    System.out.println("Player 2 rolled "+ player2dice1 + " and " + player2dice2 + "! A total of " + sum2 + "!");
                    System.out.println();

                    //Checker hvem der har vundet
                    if (sum1 > sum2){
                        System.out.println("Player 1 wins!!!");
                        break;
                    }
                    if (sum1 < sum2){
                        System.out.println("Player 2 wins!!!");
                        break;
                    }
                }
            }
        }
    }
}