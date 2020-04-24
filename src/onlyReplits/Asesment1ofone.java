package onlyReplits;

import java.util.Scanner;

public class Asesment1ofone {
    public static void main(String[] args) {
        /*Given an int variable k that has already been declared,
         use a for loop to print a single line consisting of 49 hashtags.
          Use no variables other than k.

         */
        int k = 1;

        for ( char ch = 1;ch< 50;ch++){
            System.out.print("# ");

        }


     }

    public static class printStars {
        public static void main(String[] args) {

          int i = 1;
            int j = 1;
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            for(j = 0; j <= n; j++){
                for(i = 0; i <=j; i++){
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }
}
