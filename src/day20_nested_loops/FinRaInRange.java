package day20_nested_loops;

import java.util.Scanner;

public class FinRaInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("finra");

            } else if (num % 3 == 0) {
                System.out.println("fin");
            } else if (num % 5 == 0) {
                System.out.println("ra");
            }

        }

        System.out.println(num);






    }
}
