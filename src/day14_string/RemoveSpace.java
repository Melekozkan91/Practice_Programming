package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {

        String day ="    Thursday   ";
        int numOfCharBeforeTrim = day.length();
        System.out.println("numOfCharBeforeTrim ="+numOfCharBeforeTrim);

        day =day.trim();
        int numberOfCharAfterTrim = day.length();
        System.out.println("numberOfCharAfterTrim = "+numberOfCharAfterTrim);

        String msg ="    Today we learned good String methods";
        System.out.println(msg.startsWith("Today")); //false

        msg = msg.trim();

        System.out.println(msg.startsWith("Today"));




    }
}
