package day11_if_statements;

import java.util.Scanner;

public class Drive {
    /*
    declare a variable called speed and assign int value
    neighbourhood(45) based on the speed limit print the related message
    above 90 (inclusive)--> your speed limit is requiring jail
    above 70 (inclusive)--> your speed limit requires DL suspension
    above 60(inclusive) --> your speed requires court
    above 50(inclusive) --> your speed requires a ticket
    between 35 and 50 (both inclusive)  --> your speed limit is in the speed range
    below 35        --> going to slow or you are parked
    else            --> not valid input


     */
    public static void main(String[] args) {
        int speed =100; // 100>=90 -->TRUE
        //Scanner input =new Scanner(System.in);
        //int speed = input.nextInt();

        if(speed>=90){
            System.out.println("Your speed limit is requiring jail");

        } //100>=70 ===> TRUE
        else if(speed>=70){
            System.out.println("Your speed limit requires DL suspension");

        }else if(speed>=60){
            System.out.println("your speed requires court");

        }else if(speed>=50){
            System.out.println("your speed requires a ticket");


        }else if(speed>=35 && speed<=50){

        }



    }
}
