package my_util;

public class StringUtil {
    /*
    reverse
    create a method that will accept a String and return the reserved String
     */
    /**
     This method mode by Loopcamp Batch#1
     The method accept a String and returns the reserved String
     */

    public static String reverseStr (String str){
        String reserved ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reserved +=str.charAt(i);


        }
        return reserved;

    }






}
