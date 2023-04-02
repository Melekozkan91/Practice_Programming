package day24_office_hours;

public class Car {

    //make a method that prints out "Unlocking the car"

    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }
    //Declare a method that prints out "open the door"
    public static void openDoor(){
        System.out.println("Opening the door");
    }
    //Declare a method that prints: "Getting in the car" / " Closing the door"

    public static void getInCar(){
        System.out.println("Getting in the car");
        System.out.println("Closing the door");
    }

    //Declare a method that prints couple statements for getting ready
    public static void getReadyToGo(){
        System.out.println("Putting a seatbelt");
        System.out.println("Checking mirrors");
        System.out.println("Put a music");
        System.out.println("Put on a navigation");
    }
    //Declare a method that starts the car
    public static void startCar(){
        System.out.println("Starting a car");
    }

    //Declare a method for driving

    public static void getReady(){
        System.out.println("Putting gear into driver mode");
        System.out.println("Start driving");
    }
    public static void total(){


        unlockCar();
        openDoor();
        getInCar();
        getReadyToGo();
        startCar();
        getReady();

    }

    public static void main(String[] args) {
        total();
    }








}
