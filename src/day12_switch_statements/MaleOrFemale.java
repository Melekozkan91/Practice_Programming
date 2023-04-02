package day12_switch_statements;
/*
ask a user for their gender
if it is male
m,M ---> Print male bathroom
f,F -->Female restroom
 */

public class MaleOrFemale {
    public static void main(String[] args) {
        char letter ='h';
        switch (letter){
            case 'm':
            case 'M':
                System.out.println("Male restroom");

            case 'f':
            case 'F':
                System.out.println("Female restroom");
            default:
                System.out.println("Invalid letter");

        }

    }
}
