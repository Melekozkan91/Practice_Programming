package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to the wending machine");
        System.out.println("Please, select one of the followings:\n\tDrinks\n\tSnacks\n\tGum\n\nEnter: ");
        String selection = input.next();
        String msg =" ";

        switch (selection){
            case "drinks":
                System.out.println("Your chose drinks(click on 1,2,3):\n\t1-Water\n\t2-Soda\n\t3-Juice\n\nYour number: ");
                int drinkNumber= input.nextInt();

                if (drinkNumber==1){
                    msg= "You selected water ";
                } else if (drinkNumber ==2) {
                    msg ="You have selected soda";
                } else if (drinkNumber==3) {
                    msg ="You selected juice";
                }else {
                    msg = "Invalid input";
                }
                    break;
                    case "Snacks":
                        System.out.println("Your chose drinks(click on 1,2,3):\n\t1-Candies\n\t2-Pringles\n\t3-Chips\n\nYour number: ");
                        int snacksNumber= input.nextInt();

                        if (snacksNumber==1){
                            msg= "You selected candies ";
                        } else if (snacksNumber ==2) {
                            msg ="You have selected pringles";
                        } else if (snacksNumber==3) {
                            msg ="You selected chips";
                        }else{
                            msg="Invalid input";
                        }
                        break;
                    case "Gum":
                        System.out.println("Your chose gum(click on 1,2,3):\n\t1-Love\n\t2-Turbo\n\t3-Dirol\n\nYour number: ");
                        int gumNumber= input.nextInt();

                        if (gumNumber==1){
                            msg= "You selected love ";
                        } else if (gumNumber ==2) {
                            msg ="You have selected turbo";
                        } else if (gumNumber==3) {
                            msg ="You selected dirol";
                        }else{
                            msg="Invalid input";
                        }
                        break;
            default:
                msg ="Not valid selection";


                }

                System.out.println(msg);
        }


    }

