package day06_a_arithmetic_operators;

public class House {
    public static void main(String[] args) {
        String houseType ="apartment";
        int numberOfBedroom= 3;
        int numberOfBathroom = 1;
        int numberOfKitchen =1;
        boolean isThereABasement = false;
        boolean isThereAnAttic = false;
        boolean isThereAPool = false;
        boolean isItOnSale = false;
        double costOfHouse = 1_0000_000.99;
        String adress = " 123 central ave";
        int zipCode = 1233;
        boolean hasPark = true;
        double schoolRating =4.6;

        String houseInfo = "The "+ houseType+ " on "+adress+","+zipCode+ " costs $ "+costOfHouse+"\nThe "+ houseType+" has "+numberOfBedroom+ " bedroom "+numberOfBathroom+" bathromms, "+ numberOfKitchen+" kitchen "+"\nIt also includes a basement: "+ isThereABasement +" has an attic: "+ isThereAnAttic+ " has a pool: "+ isThereAPool+" is on sale "+ isItOnSale+" and has a park "+ hasPark+"\nThe schools in the area have a rating of "+schoolRating;

        System.out.println(houseInfo);







    }
}
