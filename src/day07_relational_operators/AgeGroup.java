package day07_relational_operators;

public class AgeGroup {
    /*
    declare and asign an age variable
    check if the person is a kid

    age ---> up 13 (include13)

    check if teh person is adoult
     age ---> 65 or higher


     */
    public static void main(String[] args) {

        int age =40;
        boolean isKid = age<=13;  // value has to be tru or false always

        System.out.println("You are a kid. Correct "+isKid);

        boolean isAdoult = age>=30;
        System.out.println("You are an adoult. Corrrect? "+isAdoult);













    }
}
