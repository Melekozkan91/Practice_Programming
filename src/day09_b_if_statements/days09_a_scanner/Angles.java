package day09_b_if_statements.days09_a_scanner;

import java.util.Scanner;

public class Angles {
    /*
 Write a program that asks the user to enter 3 angle numbers ( can be double numbers )
 Determine if the angles make a triangle, which means the angles add to 180.0
 and
 Determine if the angles make a circle, which means the angles add to 360.0
  */
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);
        // asks the user to 3 angle numbers
        System.out.println("Enter 3 angle numbers");
        double degreOne = input.nextDouble(),
                degreTwo = input.nextDouble(),
                degreThree = input.nextDouble();

        // for triangle  --> total degree of inner calculation is 180
        // calculate what is the total of 3 numbers
        double total = degreOne + degreTwo + degreThree;

        // Write a print statement that print if it is triangle

        System.out.println(" It is triangle: " + (total == 180));

        // Write a print statement that if it is circle

        System.out.println("It is circle: " + (total == 360));

        // Write a print statement that print if it is EITHER triangle or Circle

        System.out.println("It is either triangle or circle " + (total == 180 || total == 360));
    }
}
