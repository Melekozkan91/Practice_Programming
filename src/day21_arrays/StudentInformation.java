package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String[] student1 ={"b001","Tom","Jerry","B#1"};
        System.out.println("This is the info for Student 1:"+ Arrays.toString(student1));



        String[]student2 = new String[4]; // WE PUT THE 4 BECAUSE WE HAVE 4 ELEMENT
        System.out.println("This is the info for student1:"+Arrays.toString(student2));

        student2[0]="B002";
        student2[1]="John";
        student2[2]="Wick";
        student2[3]="B#2";
        System.out.println("This is the info for student1:"+Arrays.toString(student2));
        String [] student3 = new String[4];
        Scanner input = new Scanner(System.in);












    }
}
