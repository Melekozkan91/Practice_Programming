package day12_switch_statements;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch (number){
            case 1:
                System.out.println("1-Monday");
                break;

            case 2:
                System.out.println("2-Tuesday");
                break;

            case 3:
                System.out.println("3-Wednesday");
                break;

            case 4:
                System.out.println("4-Thursday");
                break;

            case 5:
                System.out.println("5-friday");
                break;

            case 6:
                System.out.println("6-saturday");
                break;

            case 7:
                System.out.println("7-sunday");
            default:
                System.out.println("Not a day!");


        }

    }
}
