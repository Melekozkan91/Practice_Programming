package day22_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 ="silent";
        String word2 ="listen";

        //1
        //String [] wordArr =word1.split("");
        char [] wordArr1 =word1.toCharArray();
        char [] wordArr2 =word2.toCharArray();

        //2-sort both arrays

        Arrays.sort(wordArr1);
        Arrays.sort(wordArr2);

        //3-compare two arrays
        System.out.println(Arrays.equals(wordArr1,wordArr2) ?"Anagram" :"Not anagram");

        if (Arrays.equals(wordArr1,wordArr2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }


    }
}
