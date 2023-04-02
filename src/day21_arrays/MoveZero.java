package day21_arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] original = {0,0,5,1,0}; // most use this way 
        int [] changed = new  int[original.length];
        int index =0;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(changed));
        System.out.println("========================");
        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0){
                changed[index]=original[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(changed)); // this one is not 0










    }
}
