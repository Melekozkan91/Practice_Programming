package day07_relational_operators;

public class GiftCard {
    /*
    declare and assign a gift card with 300;
    buy 2 items
    buy item1 for 450
    buy item2 for $100
    print out the remaining

     */
    public static void main(String[] args) {
        double giftcard =300;

        String item1 ="dior";
        String item2 ="Channel";
        System.out.println("I have "+giftcard +" wort of gift card.");
        //giftCard = giftCard - 50;
        giftcard -= 50;
        System.out.println("After buying"+item1+"I have left "+giftcard+"amount in gift card.");


        giftcard-=100;
        System.out.println("After buying"+item1+"I have left "+giftcard+"amount in gift card.");
        // multiply gift card balance by 2.

        giftcard*=2;
        System.out.println("Now I have a new balance of $"+giftcard);













    }

}
