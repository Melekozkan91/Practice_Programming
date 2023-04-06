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
            reserved += str.charAt(i);


        }
        return reserved;
        /**
         * This method made by Loopcamp Batch#1
         * This method accepts a String parameter and puts it in a format
         * Ex:
         *    The format will be like this
         *    First letter is in upper case and rest is in lower case
         *
         * Then return a String in a formatted way

         */





    }
    public static String fixFormat(String str){ // __feyruz__ --F
        String fixed =str.trim();
         fixed = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        return fixed.trim();


    }

    /**
     * This method will accept a String with multiple words
     * And convert it to camelCse String
     * input
     * :
     * JAVA will ruLE tHe wORLd
     * output:
     * javaWillRuleTheWorld
     */

    public static String camelCase (String str){
        String [] arr =str.split(" ");
        String result ="";
        for (String each:arr) {
            result += (each.charAt(0)+"").toUpperCase()+each.substring(1).toUpperCase();
        }
        return (result.charAt(0)+"").toLowerCase()+result.substring(1);



    }

    /**
     * This method accepts String and a char
     * And returns how many times that char exist in the String
     *
     * input:
     * apple,z
     * output:
     * 0
     */
    public static  int frequencyOfCharacter(String str, char ch){
        //aabbaacca, a
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                count++;


            }

        }
        return count;
    }







}


