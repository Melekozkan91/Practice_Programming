package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 =5;
        double num2 =4;
       // double addition = 4+5 ; // hard coded
        double addition = num1 + num2; // dynamic

        double subtraction = num1+ num2;
        double multiplication = num1* num2;

        double division = num1 / num2;
        double reminder = num1 /num2 ;




        System.out.println(num1 +" +"+ num2 +"= "+ addition);
        System.out.println(num1 +" -"+ num2 +"= "+ subtraction);
        System.out.println(num1 +" *"+ num2 +"= "+ multiplication);
        System.out.println(num1 +" /"+ num2 +"= "+ division);
        System.out.println(num1 +" +"+ num2 +"= "+ reminder);
        System.out.println (num1 + " + " + num2 + " = " + num1 + num2);
        System.out.println (num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println (num1 + num2 + " = " + num1 + num2);

/*
10/3 = 3.33333
10% 3 = 1

10%3 = 1
3+3+3 = 9
10-9= 1


5%4=1
4
5-4 = 1


 */





    }
}
