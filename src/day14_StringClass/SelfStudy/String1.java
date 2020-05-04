package day14_StringClass.SelfStudy;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1 words");
        String word1 = scan.next();
        scan.nextLine();
        System.out.println("Enter your 2 word");
        String word2 = scan.next();
        scan.nextLine();
        String total = word1.concat(","+word2+",").concat(word2+",").concat(word1+",");
        System.out.println(total);

         */

         Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word one");
        String w1 = scan.next();
        scan.nextLine();
        System.out.println("Enter  second word one");
        String w2 = scan.next();
        scan.nextLine();

        String add = w1.substring(1) + w2.substring(1);
        System.out.println(add);






    }
}
