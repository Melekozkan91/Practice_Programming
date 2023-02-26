package day07_relational_operators;

public class OperatorPractice {


    public static void main(String[] args) {

        int i = 5;
        int y =-i++ + --i + i++ / i--;
        // y = -5   +   5 + 5   / 6  // int a = 5/5; --4/5 =0 ,, int b = 13%8;
        //y  = -5 +    5  + 0                                 // 13/8 =1 (8/8) + 5/8  hownmany 8 you can feet in 13 --> just 1
        // y = -5    +  5
        // y = 0

         System.out.println(i);
         System.out.println(y);


        int k = 5;

        int m = --i + i--;




         System.out.println(m);





    }
}
