package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {
        int n =2;

        //while (n<=100){
        //    System.out.println(n);
           // n++;
       // }

        // print even number from 2 to 100
        System.out.println("----------------");

        while (n<=100){
            if (n%2==0){
                System.out.println(n);
            }
           n++;
        }
        while (n <=100){
            System.out.println(n);
            n +=2;

        }
        System.out.println("-----------------");
        // n=100;
        n=2;
        // print even numbers from 2 to 100
        while (n <=100){
            System.out.println(n);
            n +=2;

        }
        System.out.println("-----------");
        n =2;
        while (n<=100){
            if(n %2 ==0 ){
                System.out.println(n);
            }
            n++;
        }













    }
}
