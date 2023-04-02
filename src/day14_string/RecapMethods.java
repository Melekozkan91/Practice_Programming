package day14_string;

import java.util.Locale;

public class RecapMethods {
    public static void main(String[] args) {


        String str ="Loop"; // we made a string object by LITERALS
        String str2 = new String("Loop"); //we made a String object by new keyword

        System.out.println("Compare with=="+(str==str2)); // false
        System.out.println("\"Compare with.equals()"+(str.equals(str2)));

        System.out.println("Compare with=="+(str.equals("looop"))); // false

        System.out.println("compare with .equalsIgnoreCase()"+str2.equalsIgnoreCase("Loop")); // true


        String word1="loop academy";
        System.out.println("To upper case: "+word1.toUpperCase());

        String word2 ="LOOP ACEDEMY";
        System.out.println("To lower case: "+word2.toLowerCase());

    }
}
