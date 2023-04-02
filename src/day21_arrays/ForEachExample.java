package day21_arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] num ={30,12,159,12};
        for (int i = 0; i < num.length; i++) {
            System.out.println("With traditional for loop:"+num[i]);

        }
        System.out.println("================");

        for (int each: num) {
            System.out.println("With for each loop:"+each); //for each print all always

        }
        System.out.println("================");








    }
}
