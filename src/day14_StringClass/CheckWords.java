package day14_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second words");
        String word2 =input.next();
        System.out.println("Enterthird words");

        String word3 =input.next();
        int lenth1 = word1.length();
        int lenth2=word2.length();
        int lenght3= word3.length();

        boolean allNotSome = lenth1!= lenth2 &&lenth2!=lenght3 &&lenth1!=lenght3;
         if(lenth1 ==lenth2&& lenth2==lenght3){
             System.out.println("all are same");
         }else if(allNotSome){
             System.out.println("They are not same");
         }else{
          System.out.println("Not same not different Lenght");
         }
    }
}
