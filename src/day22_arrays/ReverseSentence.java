package day22_arrays;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence ="Today is Wednesday and learned some useful methods";
        //               methods useful some learned we and Wednesday is today

        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reserved ="";

        for (int i = words.length-1; i >=0; i--) {
            reserved+=words[i]+"";


        }
        System.out.println(reserved.trim());




    }
}
