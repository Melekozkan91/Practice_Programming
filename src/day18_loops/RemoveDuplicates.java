package day18_loops;

public class RemoveDuplicates {
    /*
Remove Duplicates
    Write a program that can remove duplicates from a String
     Ex:
    Input: abcaabc
    Output: abc
 */
    public static void main(String[] args) {
        String word ="abcaabc";
        String unique ="";
        for (int i = 0; i < word.length(); i++) {
            if (!unique.contains(""+word.charAt(i))){
                unique+=word.charAt(i);
            }



        }
        System.out.println(unique);






    }
}
