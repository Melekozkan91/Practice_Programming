package day08_scanner_locical_operators;

public class LogicalOperator {
    /*
 In Math

     Q: give me a number bigger than 3 AND less than 7?

     A: 3 < myNumber < 7

         3 < 5             ---- > true
             5 < 7        ---- > true



     Q: give me a number bigger than 3 or equal AND less than 7 or equal?

     A: 3 <= myNumber <= 7


 In Java

     3 < myNumber < 7

     3 < nyNumber and myNumber <7

  */
    public static void main(String[] args) {
        int num = 20;
        System.out.println(num > 5);
        System.out.println(num < 10);

        System.out.println(num > 5 && num > 10);
        System.out.println(num < 5 && num > 10);

        int i = 5;
        int y = 10;
        System.out.println(y > 9 && i++ > 2);

        System.out.println(i);
        i = 5;
        System.out.println(y < 9 && i++ > 2);
        System.out.println(i);

        int x = 20;
        int w = 30;
        System.out.println(x < 5 || w++ > 20); //true
        //                 false executed
        System.out.println(w); //31
        w = 30;

        System.out.println(x > 5 || w++ > 20); //true
        //                 true not executed
        System.out.println(w);
        boolean isCorrect = false;
        System.out.println(isCorrect);

        System.out.println(false);

        System.out.println(!false);
        System.out.println(!isCorrect);

    }
}