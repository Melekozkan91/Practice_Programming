package day17_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int numOfSum =0;

        //continue getting a number from user until it is negative number
        while (num >=0 ){
            numOfSum =numOfSum+num; //
           //  numOfSum += numOfSum + num; same thr other one
            System.out.println("Sum of the number so far: "+numOfSum);
        }
    }
}
