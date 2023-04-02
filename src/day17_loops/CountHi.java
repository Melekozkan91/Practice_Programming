package day17_loops;

public class CountHi {
    public static void main(String[] args) {


        String sentence="aaaaaaaahiaaaahiaaahiaaahi";
        int countOfHi =0;

        for (int i= 0;i<sentence.length();i++){
            if (sentence.charAt(i)=='h' && sentence.charAt(i+1)=='i'){
                countOfHi++;
            }
        }
        System.out.println("This is amount of hi you hava:"+countOfHi);



    }
}
