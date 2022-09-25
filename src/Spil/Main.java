package Spil;

import Test.TestDice;

import java.util.Scanner;

import static Test.TestDice.*;

public class Main {
    public static void main(String[] args) {
        //Initialisere spiller 1 og 2. sum=antal points, roll=værdi af kast.
        int player1roll=0, player1sum=0, player2roll=0, player2sum=0;

        while (player1sum<40 || player2sum<40){
            Scanner input = new Scanner(System.in);

            System.out.println("________________________________________");
            System.out.println("Player 1! Hit ENTER to roll! ");
            String pause1 = input.nextLine();
            player1roll=dice();
            player1sum += player1roll;
            System.out.println("You rolled "+player1roll+" and have "+player1sum + "points!");
            player1roll = 0;

            System.out.println("________________________________________");
            System.out.println("Player 2! Hit ENTER to roll! ");
            String pause2 = input.nextLine();
            player2roll = dice();
            player2sum += player2roll;
            System.out.println("You rolled "+player2roll+" and have "+player2sum + "points!");
            player2roll = 0;

            if (player1sum >=40 && player2sum < 40) {
                System.out.println("Player 1 wins!!!");
                break;
            }
            if (player2sum >=40 && player1sum < 40) {
                System.out.println("Player 2 wins!!!");
                break;
            }
            if (player2sum >=40 && player1sum >= 40) {
                player1roll = dice();
                player2roll = dice();
                if (player1roll > player2roll){
                    System.out.println("Player 1 wins!!!");
                }
                if (player1roll < player2roll){
                    System.out.println("Player 2 wins!!!");
                }
                while (player1sum==player2sum){
                    player1roll = dice();
                    player2roll = dice();
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