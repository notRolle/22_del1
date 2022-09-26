package Test;
import java.lang.Math;

import java.util.Scanner;

import static Test.TestDice.*;

public class Test {
    public static void main(String[] args) {
        //Initialisere spiller 1 og 2. sum=antal points, roll=værdi af kast.
        int player1roll=0, player1sum=0, player2roll=0, player2sum=0;

        // Looper skiftevis kast, så begge spillere når at kaste lige mange gange
        while (player1sum<40 || player2sum<40){
            Scanner input = new Scanner(System.in);

            //Spiller 1 tur
            System.out.println("________________________________________");
            System.out.println("Player 1! Hit ENTER to roll! ");
            String pause1 = input.nextLine(); //Indsat pause, så spiller 1 skal gøre noget for at kaste
            player1roll=12; //Terning kast
            player1sum += player1roll; // Tilføjer kast til sum
            System.out.println("You rolled "+player1roll+" and have "+player1sum + "points!"); //Printer kast og points

            //Spiller 2 tur
            System.out.println();
            System.out.println("________________________________________");
            System.out.println("Player 2! Hit ENTER to roll! ");
            String pause2 = input.nextLine();
            player2roll = 12;
            player2sum += player2roll;
            System.out.println("You rolled "+player2roll+" and have "+player2sum + "points!");
            System.out.println();



            //Checker om spiller 1 har vundet
            if (player1sum >=40 && player2sum < 40) {
                System.out.println("Player 1 wins!!!");
                break;
            }
            //Checker om spiller 2 har vundet
            if (player2sum >=40 && player1sum < 40) {
                System.out.println("Player 2 wins!!!");
                break;
            }
            //Checker om begge spillere har over 40 points
            if (player2sum >=40 && player1sum >= 40) {
                //Begge spillere kaster igen
                player1roll = 12;
                player2roll = 12;


                System.out.println();
                System.out.println("Both players have over 40 points! ");

                //Spiller 1 kaster igen
                System.out.println("Player 1! Hit ENTER to roll");
                String pause3 = input.nextLine();
                System.out.println("Player 1 rolled "+ player1roll);
                System.out.println("");

                //Spiller 2 kaster igen
                System.out.println("Player 2! Hit ENTER to roll");
                String pause4 = input.nextLine();
                System.out.println("Player 2 rolled "+ player2roll);
                System.out.println("");

                //Checker hvem det slog det højeste slag og vinder
                if (player1roll > player2roll){
                    System.out.println("Player 1 wins!!!");
                }
                if (player1roll < player2roll){
                    System.out.println("Player 2 wins!!!");
                }

                //Hvis de slog det samme looper den indtil en vinder.
                while (player1roll==player2roll){

                    //Begge spillere kaster igen
                    player1roll = 12;
                    player2roll = 12;

                    //Spiller 1 kaster igen
                    System.out.println("the same? Roll again player 1! Hit ENTER");
                    String pause5 = input.nextLine();
                    System.out.println("Player 1 rolled "+ player1roll);
                    System.out.println();

                    //Spiller 2 kaster igen
                    System.out.println("Player 2! Hit ENTER to roll");
                    String pause6 = input.nextLine();
                    System.out.println("Player 2 rolled "+ player2roll);
                    System.out.println();

                    //Checker hvem der har vundet
                    if (player1roll > player2roll){
                        System.out.println("Player 1 wins!!!");
                    }
                    if (player1roll < player2roll){
                        System.out.println("Player 2 wins!!!");
                    }
                }
            }
        }
    }
}
