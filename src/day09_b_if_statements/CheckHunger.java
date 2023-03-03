package day09_b_if_statements;

import java.util.Scanner;

public class CheckHunger {
            /*
    boolean variable isHungry

            if the person is hungry,print: You are hungry, so I will get some food for you

            if the person is not hungry, print: Great, then practice java
     */

    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.println(" Are you hungry (true or false):");
        boolean isHungry = input.nextBoolean();
        if (isHungry){
            System.out.println("Lets go to Texas de Brazil");

        }else{
            System.out.println(" I can not stay without eating anything. Give me some DOLMA");
        }

    }
}
