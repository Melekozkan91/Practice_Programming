package day17_loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count =1;
        int smallest=Integer.MIN_VALUE;
        int biggset =Integer.MAX_VALUE;

        while (count<=5) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            //smallest=num;
            //biggest=num;

            if (num>smallest){
                smallest =num;
            }
            if (num<biggset){
                biggset =num;
            }


            count++;

        }
        System.out.println("Max: "+biggset);
        System.out.println("Min: "+smallest);

    }
}
