package day20_nested_loops;

public class ContinueNested {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {  // outer loop

           // if (i==1){
           //     continue;
          //   }
            System.out.println("i: "+i);


            for (int j = 0; j < 3; j++) { // inner loop
                if (j==2){
                    continue;
                }
                System.out.println("j: "+j);

            }

        }





    }
}
