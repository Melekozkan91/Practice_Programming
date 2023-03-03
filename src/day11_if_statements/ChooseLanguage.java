package day11_if_statements;

import day08_scanner_locical_operators.Scannerintro;

import java.util.Scanner;

public class ChooseLanguage {
    /*
    ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French
    6- azari

    1-> "Hello, thank you for the call
based on the number they picked print a message:
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number based on the language they wanted to use:\n\t1-English\n\t2-Spanish\n\t3-Turkish\n\t4-Russian\n\t5-French\n\t6-Azeri\n\nEnter number:");
        int languageNum = input.nextInt();

        if (languageNum ==1){
            System.out.println("Hello, thank you for the call");
        } else if (languageNum ==2) {
            System.out.println("Hola,gracias...");

        } else if (languageNum ==3) {
            System.out.println("Merhaba,ardiginiz icin tesekkurler");


        } else if (languageNum ==4) {
            System.out.println("Privet, spasibo za vash zvonok");


        } else if (languageNum ==5) {
            System.out.println("bonjour, merci pour lappel");

        } else if (languageNum ==6) {
            System.out.println("Tez de gorum.Konturum gurtardi");

        }else {
            System.out.println("Invilad input");
        }



    }

}
