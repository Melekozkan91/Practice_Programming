package day09_b_if_statements;

import java.util.Scanner;

public class SingleIfWithScanner {
    public static void main(String[] args) {
        //create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Why are we studying Java?");
        String answer = input.next();

        System.out.println("Is java fun?(true false) ");
        boolean answer2 = input.nextBoolean();

        if (answer2) {

            System.out.println("Fayruz is really happy");

        }
        //
        if (!answer2) {
            System.out.println("Turn your camera on it time to be grilled");


        }
    }
}
