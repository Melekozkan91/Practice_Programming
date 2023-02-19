package day06_b_unary_operators;

public class InceremtExample3 {
    public static void main(String[] args) {
        int i = 5;
        int z = i++; // z=5;   i = i +1; --> i =6 ;
                           // i +1;


        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a + 1 ;
        System.out.println(a);
        System.out.println(b);

        int c = ++a; // c = (a =+1)

        //int c= (a = a = + 1);

        int d = a++;
        // ind d = a; a=a+1 (12)

        System.out.println(a);







    }
}
