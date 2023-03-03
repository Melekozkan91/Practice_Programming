package day10_a_if_statements;

public class CheckCharacters {
    /*
    create a char variable with a letter
    find out if the letter is an upper case letter or lowercase letter
    ex;
    'b'
    print out : lowercase
    'A'
    print out: uppercase

     */

    public static void main(String[] args) {

        char letter = 'g';
        //if (letter >= 65 && letter <=90){
         //   System.out.println("Uppercase");
        //}
        if (letter >= 'A'&& letter <= 'Z'){
            System.out.println("Uppercase");
        }
        if(letter>='a'&& letter <='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("It is not letter");

        }









    }
}
