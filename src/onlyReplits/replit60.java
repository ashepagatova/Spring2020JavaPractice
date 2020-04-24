package onlyReplits;


import java.util.Scanner;

public class replit60 {
    public static void main(String[] args) {
/*

Write a program that will verify if word contains in the sentence. Print out the result as boolean value.
060. Verify contains_String Methods
 */
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        //WRITE YOUR CODE HERE

        int totalLenght = word.length()-1;
        char  ch1=word.charAt(totalLenght);
        System.out.println(ch1);


    }
}
