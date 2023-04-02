package day17_loops;

import java.util.Scanner;

public class AtmLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to ATM");
        int validPin =1788;
        int attemptCount=1;
        int userInputPin;

        /*
        ask user to "Enter a pin "
        after three invalid pin attempt, and asking user
         */

        do {
            System.out.println("Enter a pin: ");
            userInputPin = input.nextInt();
            attemptCount++;
        }while (attemptCount <= 3 && validPin !=userInputPin);
        System.out.println("You are locked out.Please contact customer service");




    }
}
