package day16_ForLoop;

import java.util.Scanner;

public class PalindramTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = scan.nextLine();//Java
        String reverdWord = "";      // 01234

         for ( int i=word.length()-1; i>= 0;i--){
             reverdWord+=word.charAt(i);
         }
         boolean palindrome = word.equalsIgnoreCase(reverdWord);
        System.out.println(palindrome);

    }
}
