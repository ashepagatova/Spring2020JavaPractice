package day14_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class combinetwoString {

    public static void main(String[] args) {
        /*
        1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
         */

        Scanner input = new Scanner(System.in); // creating object scanner

        System.out.println("Enter first words");
        String word1 =input.next();

        System.out.println("Enter second word");//
        String word2 =input.next();

        String result = word1.concat(" "+word2).concat(" "+word2).concat(" "+word1);
        System.out.println(result);


    }
}
