package day19_nested_loops;

public class Month {
    public static void main(String[] args) {

        System.out.println("Day "+1 );
        System.out.println("Day "+2 );
        System.out.println("Day "+3 );
        System.out.println("Day "+4 );
        System.out.println("Day "+5 );
        System.out.println("Day "+6 );
        System.out.println("Day "+7 );

        System.out.println("======================");

        for (int i = 1; i <=7 ; i++) {
            System.out.println("Day "+i);

        }
        System.out.println("=======================");

        for (int i = 1; i <= 4; i++) {
            System.out.println("Week "+i);
            for (int j = 1; j <=7; j++) {
                System.out.println("Day "+j);
            }
            System.out.println();
        }








    }
}
