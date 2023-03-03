package day08_scanner_locical_operators;

public class Discount {
    /*
declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions

     */
    public static void main(String[] args) {
        boolean weekend = true;
        boolean teacher = false;
        boolean policeOfficer = false;
        boolean firefighter = true;

        boolean getsDiscount = weekend && (teacher || policeOfficer || firefighter);

        System.out.println("Do you get a discount? " + getsDiscount);
    }
}
