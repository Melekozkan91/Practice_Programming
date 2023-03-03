package day11_if_statements;

import java.util.Scanner;

public class LoginApp {
    /*
    declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
example expected:
    pin: 1552
    ssn: 1234

outputs:

when the pincode and ssn match the expected print:
    Authentication successful

when the pincode or ssn are not correct print:
    Authentication failed

when the pincode was not correct print:
    incorrect pin code

when the ssn is not correct print:
    invalid ssn

     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please, enter 4 digit pin cose: ");
        int userPincode = input.nextInt();

        System.out.println("Enter your last 4 SSN digits: ");
        int userSnnDigits = input.nextInt();

        int expectedPincode =1234;
        int expected4SnnDigit =4321;

        if(userPincode ==expectedPincode && userSnnDigits == expected4SnnDigit){
            System.out.println("Logged in successfully");

        }else{
            System.out.println("Authentication failed");
      //      if(userSnnDigits != expectedPincode && userSnnDigits !=expected4SnnDigit){
       //         System.out.println("Eiter pincod or SSN is incorrect");
      //      }
           if(userPincode!= expectedPincode){
               System.out.println("You have entered invalid pin code");

           }
           if(userSnnDigits != expected4SnnDigit){
               System.out.println("You have entered invalid SSN 4 digits");
           }
        }


    }
}
