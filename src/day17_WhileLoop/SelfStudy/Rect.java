package day17_WhileLoop.SelfStudy;

public class Rect {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("@ ");
            }
            System.out.println();

        }

        for (int i = 10; i >0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" @");
            }
            System.out.println();
        }

         */

       for (char i = 'a'; i < 'z'; i++) {
           for (char j = 'z'; j > 'a'; j--) {
               System.out.print(j+" ");
           }
           System.out.println();
        }



    }


}
