package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter which month number you want: ");
        int monthNum =input.nextInt();

        String [] allMonth = {"January","February","March","April","May","June","July","August","Sptember","October","November","December"};
        System.out.println("The number you entered respesents this month:"+ allMonth[monthNum-1]); // 12-1





    }
}
