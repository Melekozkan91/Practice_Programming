package day06_b_unary_operators;

public class Store {
    public static void main(String[] args) {
        String store =" target";
        int numberOfTv = 100;

        System.out.println("I have a total of "+ numberOfTv +" TV");


        System.out.println("Person comes into the store and they bout a tv");
        // numberOfTv = numberOfTv -1 ;
        System.out.println("Number of tv left in the store:"+ --numberOfTv);

        System.out.println("Another person comes into store and puts the TV into his cart");
        System.out.println("Available TV in store: "+ numberOfTv--);
        System.out.println("The some peron who had the TV in his cart bought the TV");
        System.out.println("Now we have TV in total: " + numberOfTv);



    }
}
