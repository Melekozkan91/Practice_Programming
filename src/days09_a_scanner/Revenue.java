package days09_a_scanner;

import java.util.Scanner;

public class Revenue {
    /*
  Write a program that asks the user to enter a price and quantity and then calculete  the revenue.
   revenue +price * quantity


   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // java creaters an object here

        double price; // java declares a price variable that has data type of double
        int quantity;// java declares a quantity variable that has data type of int
        System.out.println("Enter the pricee and quantity: "); // java says print out whatever is in double quote

        price = input.nextDouble();  //Java asked user to put input/info/value that assign that value to price variable
        quantity = input.nextInt(); // java asked user to put input /input/value that assign that value to price variable

        double revenue = price * quantity;
        System.out.println("Your revenue: " + revenue);


        // System.out.println();
        //System.out.println(price);
        //  System.out.println(quantity);
    }
}
