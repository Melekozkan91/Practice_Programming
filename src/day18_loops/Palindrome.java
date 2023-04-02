package day18_loops;

public class Palindrome {
    /*
    Palindrome: its the same reading from the beginning and end

    Ex:
        mom
        racecar
        anna
        madam

    Task: Check if a word is palindrome

    Flow:
        declare some initial String
        how to reverse a String
        check if the reverse version is the same as the original
 */
    public static void main(String[] args) {
        String word ="abbcbr";  //.length();-->5
        String revers ="";

        for (int i =word.length()-1; i >=0 ; i--) {

            revers = revers+""+word.charAt(i);
        }
        if (word.equals(revers)) {
            System.out.println("It is a palindrome word");
        }else {
            System.out.println("It is Not a palindrome word");
        }

    }
}
