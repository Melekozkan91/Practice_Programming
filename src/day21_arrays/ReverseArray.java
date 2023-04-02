package day21_arrays;

import java.sql.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] original ={1,2,3,4,5};
        int [] reserved = new int[original.length]; // has the same length

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reserved));
        System.out.println("============");

        for (int i = original.length-1; i >= 0; i--) {
            reserved[reserved.length - (i+1)] = original[i];

        }
        System.out.println();
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reserved));









    }
}
