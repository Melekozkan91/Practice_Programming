package day15_string;

import java.util.Scanner;

public class MoveFirstWord {
    /*
   [Move first word]
       Given a sentence. Display the sentence with the first word moved to the end of the sentence.
       Ex:
       Input: Java is a fun language
       Output: is a fun language Java
       Hint: Use indexOf and substring
    */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        // Java is a fun language
        //1- get index of first space
        int firstIndexOfSpace =sentence.indexOf(" ");
        //2- get the Java

        String beginning = sentence.substring(0);

        //3 - second part of the sentence
        String secondPart =sentence.substring(firstIndexOfSpace+1);
        System.out.println(beginning);
        System.out.println(secondPart);

        System.out.println(secondPart+"" +beginning);



    }
}
