package day25_methods;

import my_util.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {

        int [] arr =new int[]{23,44,2,34,555};
        System.out.println(ArrayUtil.minNumInArr(arr));
        System.out.println(ArrayUtil.minNumInArr(new int[]{14,45,4,55}));

        System.out.println(ArrayUtil.minNumInArrWithShort(arr));
        System.out.println(ArrayUtil.minNumInArrWithShort(new int[]{14,45,4,55}));







    }
}
