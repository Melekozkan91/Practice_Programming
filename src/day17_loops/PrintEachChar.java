package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str="java";
        //          0123

        System.out.println(str.charAt(0)); //j
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        System.out.println("------------");

        for (int i=0; i<=str.length()-1; i++){  // i<str.length()
            System.out.println(str.charAt(i));
        }



    }
}
