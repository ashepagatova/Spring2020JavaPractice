package day14_StringClass;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.Scanner;

public class combineString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        2. Ask user to enter two words.
         Print first word without its first character then print the
         second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
         */

        Scanner input = new Scanner(System.in); // creating object scanner
        System.out.println("Enter first words");
        String word1 =input.next();
         word1=word1.substring(1,word1.length());

        System.out.println("Enter second word");
        String word2 =input.next();
        word2 = word2.substring(1 ,word2.length());
        String result = word1 + word2;
        System.out.println(result);




    }
}
