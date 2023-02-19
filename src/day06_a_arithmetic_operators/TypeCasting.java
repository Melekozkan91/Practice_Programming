package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 40;
        int i =b; // the byte value is automatically ( implicitly) converted to int, because byte is smaller that int.

        int i2 = 100;
        //byte b2 = i2;  //Reassigning check the data type first. That is why we can not put it this way
        byte b2 = (byte)i2; // Reassingning check the data type first. With casting we can put like this.
        byte b3 =100; // putting a value directly gives a data type automatically after checking the range


        System.out.println("b2:"+b2);
        System.out.println("b3:"+b3);

        int i3 = 130;
        byte b4 = (byte)i3; // -128 ..... 127 --> after casting the data type, if check the value if it is in the rage.


        System.out.println("b4:"+ b4);


        char letter = 65; // implicit casting (automatically casts)
        char letter2 = 'A'; // Explicit casting ( automatically casts)

        System.out.println("letter1:"+letter);
        System.out.println("letter2:"+ letter2);

        byte b5 = 'B';
        char letter3 = (char)b5;
        System.out.println("letter3:"+ letter3);

        byte aa =5;
        char bb= (char)aa;

        System.out.println("bb: "+bb);


        int i10 =500;
        long l1 =i10; // int is smaller than long, so it is will automatic call cast


        long l2 = 200;
        int i11 =(int)l2; // here the explicit casting is needed


        long l3 = 1_000_000_000_000L;
        int i12 =(int)l3; // here the explicit casting is needed

        System.out.println();
        double d = 50.5;
        System.out.println("d:" +d);

        int i13 = (int)d;
        System.out.println("i13:"+i13);













    }
}
