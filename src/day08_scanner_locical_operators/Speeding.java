package day08_scanner_locical_operators;

public class Speeding {
    /*
declare 3 variables:
speed limit
speeding
print
"Is this person speeding?   true false
note: if the requirement is not clear. ask the questions.
in this case what the 65 speed should be considered?
as higher or lower than speed limit.

-65 or lower not speeding
-more than 65 is speeding



 */
    public static void main(String[] args) {
        int currentSpeed = 65;
        int speedLimit = 65;

        boolean isSpeeding = currentSpeed >= speedLimit;

        System.out.println("is this person speeding?" + isSpeeding);
    }
}
