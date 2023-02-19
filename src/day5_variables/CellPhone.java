package day5_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand ="apple";
        String model = " iphone 10";
        String color = "black";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        // I have an [ Iphone 10] from [apple]

        System.out.println(" I have an"+ model+"from"+ brand);

        // it came in the color black it has 128 GB
        System.out.println("It came in the color"+ color+"and it has"+ storage+ "GB");

        // FOR THE SIM TYPE [A] WITH A HASCAMERA THE TOTAL PRICE WAS $[PRICE]
        System.out.println(" For the sim type "+ sim+"with a camera"+ hasCamera+" the total price was $"+ price );

        System.out.println();
        String fullMessage = " Ihave an" + model+ " from"+ brand + "it came in color"+ color +"and it has"+ storage +"GB"+ " For the sim type"+ sim + " with a camera"+ hasCamera + " the total pice was$"+ price ;
        System.out.println(fullMessage);







    }
}
