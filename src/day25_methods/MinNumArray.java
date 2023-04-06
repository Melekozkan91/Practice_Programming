package day25_methods;

import java.util.Arrays;

public class MinNumArray {
    public static int minNumInArr(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

    public static int minNumInArrWithShort(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int minNumInArrWithShort2(int... arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        System.out.println(minNumInArrWithShort2(2334,556,2223,444));
    }
}
