package day10_a_if_statements;

public class DayInMonth {
    /*
      create a int variable to represent the month number, where 1 is January and 12 is December.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

    Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
    Months that has 30 days: 4, 6, 9, 11
    Month that has 28 days: 2

    -- write a code that based on the mont number -->it sasya
     */
    public static void main(String[] args) {
        int monthNumber= 1;



        boolean has31Days = monthNumber==1 || monthNumber ==3|| monthNumber ==5||monthNumber==7 || monthNumber==8 || monthNumber==10 || monthNumber==12;
        boolean has30Days = monthNumber ==4 || monthNumber ==6 ||monthNumber ==9 || monthNumber == 11;
        boolean has28Days=monthNumber==2;


        if(has31Days){
            System.out.println("This month has 30 days");

        }
        if(has28Days){
            System.out.println("This month has 28 days");
        }
        else{
            System.out.println("enter a number 1-12");
            System.out.println(" wake up");
            System.out.println("not found");
            System.out.println(" we have only 12 months");
        }

        if (true){
            System.out.println("single statement in bod");


        }
        System.out.println();
        if (true)System.out.println("2nd single statement without curly braces");

        if(3>4){
            System.out.println("3rd single statement");
            System.out.println("");
        }





    }

}
