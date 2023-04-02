package day18_loops;

import java.util.Scanner;

public class CountWords {

/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */
public static void main(String[] args) {

    Scanner input =new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    int count =0;

    String sentence = input.nextLine().trim();
    //sentence=sentence.trim();


   for (int i=0; i<sentence.length();i++){
        if (sentence.charAt(i)==' '){
            count++;
        }

   }
    System.out.println("The count of words: "+(count+1)); // we should put +1 because we have more words









}


}
