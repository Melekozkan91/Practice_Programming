package day13_string;

public class StringMethods {
    public static void main(String[] args) {

        String name ="James";

        // how the compare 2 strings exactly--> we user .equals(); methods
        System.out.println(name.equals("James")); // same thing
        System.out.println("James".equals("James"));

        int num =1;
        System.out.println(num ==1);
        System.out.println(1==1);

        //how to compare 2 string ignoring case sensitiveness
        System.out.println(name.equalsIgnoreCase("JAMES"));


    }
}
