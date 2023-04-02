package day17_loops;

import java.util.Scanner;

public class ShoppingList {
    /*
    repeated steps:
        ask the user to enter the item
        add item to shopping list
        ask the user if they want to add more items

        at the end show the full shopping list

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping List:";

       // do {

            System.out.println("Enter name of the item: ");
            //String newItem =input.next();
            //list =list+"\n\t"+input.next();
            list += "\n\t" + input.next(); // dynamic one all the same mean

            System.out.println("Do you want to add more your shopping list?");
            String addMore = input.next();
            // }while (addMore)




    }
}
