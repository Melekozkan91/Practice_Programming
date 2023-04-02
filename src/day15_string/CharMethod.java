package day15_string;

public class CharMethod {
    public static void main(String[] args) {

        String word="Loop";
        System.out.println(word.length());

        //a method which returns us a char on given INDEX - charAt(int)
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));



        String longWord="dmansnsllksmclsmclkmsclmsm";
        int lastIndex =longWord.length()-1;
        System.out.println(lastIndex);
        System.out.println(longWord.charAt(lastIndex));

    }
}
