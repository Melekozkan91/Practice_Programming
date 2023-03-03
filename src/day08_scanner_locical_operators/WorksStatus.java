package day08_scanner_locical_operators;

import java.util.Scanner;

public class WorksStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");

        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();
        System.out.println("How are you? ");
        String feeling = input.next();
        System.out.println("What is the best team? ");
        String team = input.next();
        System.out.println("How much are you making? ");
        String answerSalary = input.next();


        System.out.println("First name:\t " + firstName + "\n Last name:\t" + lastName);
        System.out.println("How are you?: " + feeling);
        System.out.println("Best team ever: \t" + team);
        System.out.println("How are you? " + answerSalary);
    }
}
