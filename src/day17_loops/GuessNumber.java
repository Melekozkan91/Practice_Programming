package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*
         ask user guess a number 1-100 to find my number
         check number if lower than my guessed number ---> it is too loo
         check number if high than my guessed number ---> it is too high
         if it is correct guess---> end the loop and print " you guessed correctly

         */

        Scanner input = new Scanner(System.in);
        int ourSecretNumber =34;
        int guessNumber;

        do {

            System.out.println("Guess a number 1-100 to find what is in my mind ");
             guessNumber = input.nextInt();
            if (guessNumber < ourSecretNumber) {
                System.out.println("its to low");
            } else if (guessNumber > ourSecretNumber) {
                System.out.println("its too high");
            }
        }while (guessNumber!=ourSecretNumber);{
            System.out.println("You guessed the correct number which is: "+ourSecretNumber);

        }


    }
}
