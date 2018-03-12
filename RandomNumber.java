package javaExample;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    static int start = 1;
    static int end = 100;
    public static void main(String[] args) {
        //int counter = 1;
        // start = 1;
        //int end = 100;
        Random randomnumber1 = new Random();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Boolean checker = false;
        Boolean youWantToplay = true;
        Boolean ifYouwant = true;
        int ranum1 = randomnumber1.nextInt(end) + start;
        do {
            for (int i = 1; i >= 1; i--) {
                System.out.printf("You have %d guesses left \n", i);
                System.out.println("What number am I guessing?");
                int guessNum = sc1.nextInt();
                if (guessNum > ranum1) {
                    System.out.println("Your guess is higher than what im thinking");
                } else if (guessNum < ranum1) {
                    System.out.println("Your guess is lower than what im thinking");
                } else {
                    System.out.println("That's Right");
                    checker = true;
                    break;
                }

            }
            if (checker == false) {
                System.out.println("You are all out of guesses");
                System.out.printf("The number I was think is %d \n", ranum1);
            }
            System.out.println("Do you want to play again?");
            //String playYN = sc2.nextLine();
            do {
                //Scanner sc2 = new Scanner(System.in);
                String playYN = sc2.nextLine();


                if (playYN.equals("yes")) {
                    System.out.println("Lets begin");
                    ifYouwant = false;
                } else if (playYN.equals("no")) {
                    System.out.println("The games is closing");
                    System.out.println("Thank you for playing");
                    youWantToplay = false;
                    ifYouwant = false;

                } else {
                    System.out.println("That is not yes or no");
                }
            } while (ifYouwant == true);
            do {
                //Scanner sc2 = new Scanner(System.in);

                System.out.println("What number do you want the range start");
                start = sc2.nextInt();
                System.out.println("What number do you want the range end");
                end = sc1.nextInt();





            } while (ifYouwant == true);

        } while (youWantToplay == true);
    }
}
