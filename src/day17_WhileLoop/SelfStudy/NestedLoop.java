package day17_WhileLoop.SelfStudy;

public class NestedLoop {
    public static void main(String[] args) {

        for (int j = 1; j < 7 ; j++) {


            for (int i = 1; i <= 5; i++) {

                System.out.print("*");

            }
            System.out.println();
        }


        for (int i = 1; i < 9; i++) {
            int k = 1;
            while(k <= 6){
                System.out.print("#");
                k++;
            }
            System.out.println();


        }
        int w = 1;
        while (w <= 5){
            w++;
            for (int i = 1; i <= 10; i++) {
            System.out.print(" $ ");


        }
            System.out.println();
        }


    }
}
