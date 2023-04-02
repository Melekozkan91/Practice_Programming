package day13_string;

import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {
        //Scanner input =new Scanner(System.in);

        //System.out.println("Enter a letter: ");
        //String letter =input.next(); //"a" --> 97
        //lower case ---> 97 -122
        //upper case --> 65-90
        //there is a different about 32 between lower and upper case
        char letter ='A'; //-->97

        if (letter >= 97 && letter <= 122){
            System.out.println("You entered letter: "+letter+"\nYour converted letter: "+(letter- 32));
        } else if (letter>=65 && letter <= 90) {
            System.out.println("You entered letter: "+letter+"\nYour converted letter: "+(char)(letter+32));
        }else {
            System.out.println("it is not a lower case letter or upper case letter");
        }

    }
}
