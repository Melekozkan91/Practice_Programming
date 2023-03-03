package day08_scanner_locical_operators;

public class EligibleToVote {
    public static void main(String[] args) {


        String name = " tom";
        boolean isCtizen = true;
        boolean hasCriminalbackground = true;
        int age = 49;
        boolean isEligible;

        isEligible = age >= 18 && isCtizen && !hasCriminalbackground;
        //  true      &&    true &&      false
        /////////// true       &&    false
        ///////////        false

        System.out.println(name + " is eligible to vote " + isEligible);


        isEligible = age >= 18 && isCtizen && hasCriminalbackground;

        System.out.println(name + " is eligible to vote " + isEligible);

    }
}
