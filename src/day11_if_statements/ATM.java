package day11_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner INPUT =new Scanner(System.in);
        System.out.println("*** Welcome to ATM ***\n\n Please, insert your card and enter 4 digits pincode!\n\tPINCODE: ");
        int userPin = INPUT.nextInt();
        int expectedPin = 3456;
        
        if (userPin ==expectedPin){
            System.out.println("Logged In");
            System.out.println("Select one of the options below: ");
            System.out.println("\t1-Check balance");
            System.out.println("\t2-Withdraw");
            System.out.println("\t3-Deposit");
            System.out.println("\tEnter option: ");
        }
            int option = INPUT.nextInt();

            if (option ==1){
                System.out.println("Your balance is: "+100_00);

            } else if (option ==2) {
                System.out.println("How much do you want to withdraw: $");
               double withDrawAmount = INPUT.nextDouble();
                 System.out.println("You are withdrawing "+withDrawAmount);
            } else if (option==3) {
                System.out.println("Please deposit the money!");

        }else{
            System.out.println("Invalid pin number. PLease, try again");

        }

    }
}
