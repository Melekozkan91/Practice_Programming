package day15_string;

import java.util.Scanner;

public class Title {
    /*
    start with:
    mr lastname  -sir
    ms lastname -ma'am
    dr lastname  -doctor

    jr ------junior --- nice to meet you junior
    sr-------senior
     */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name, with titles: ");
        String nameAndTitle = input.nextLine();
        nameAndTitle=nameAndTitle.toUpperCase();

        if (nameAndTitle.startsWith("MR")||nameAndTitle.startsWith("MISTER")){
            System.out.println("HELLO SIR");
        }else if (nameAndTitle.startsWith("MS")||nameAndTitle.startsWith("MADAM")) {
            System.out.println("HELLO MA'AM");
        }else if (nameAndTitle.startsWith("DR")||nameAndTitle.startsWith("DOCTOR")) {
            System.out.println("HELLO DOCTOR");
        }

        if (nameAndTitle.endsWith("Jr")){
            System.out.println("Hello Junior");
        }else if (nameAndTitle.endsWith("Sr")){
            System.out.println("Hello Senior");
        }






    }
}
