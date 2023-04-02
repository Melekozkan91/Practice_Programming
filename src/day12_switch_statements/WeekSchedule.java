package day12_switch_statements;

import java.util.Scanner;
/*
enter a day week
print which class we have on that
cover
 */

public class WeekSchedule {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String dayOfWeek = input.next();
        String messega="";
        switch (dayOfWeek){
            case"Monday":
            case "monday":
            case "MONDAY":
                break;
            case "Friday":
            case "Fri":
            case "FRIDAY":
                messega="We do not have a class";
                    break;
            case "Wednesday":
            case "Thursday":
            case "WEDNESDAY":
                messega="We have Java class at 7 pm";
                break;
            case "Saturday":
                messega="We have Java class at 9:30 am";
                break;
            case "Sunday":
                messega="We have Java class at 9:30 am ";
                break;
            default:
                messega ="Sunday is valid";







        }

        System.out.println(messega);


    }
}
