package day12_switch_statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double numOne =input.nextDouble();

        System.out.println("Select operator:\n\t+\n\t-\n\t*\n\t%\n\t Enter");
        String operator = input.next();
        double numTwo =input.nextDouble();
        System.out.println("Select operator:\n\t+\n\t-\n\t*\n\t%\n\t Enter");
        boolean isValidOperator =true;


        double result=0.0;

        switch (operator){
            case "+":
                result =numTwo+numTwo;
                break;
            case "-":
                if (numOne>numTwo){
                    result=numOne-numTwo;
                }else {
                    result=numTwo-numOne;
                }
                break;

            case "/":
                if (numTwo!=0){
                    result=numOne/numTwo;
                }else {
                    System.out.println("Can not divide by 0 ");

                }
                break;
            case "*":
                if (numTwo!=0){
                    result=numOne%numTwo;
                }else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            default:
                System.out.println(operator+" is not a volid for this calculator");
                isValidOperator =false;

        }
if (isValidOperator) {
    System.out.println(numOne + " " + operator + " " + numTwo + " = " + result);
}
    }

}
