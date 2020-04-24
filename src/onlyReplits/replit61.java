package onlyReplits;

import java.util.Scanner;

public class replit61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE //Write a program that will print out the longest word between two words.
      if(word1.length()>= word2.length()){
          System.out.println(word1+"is longest");
      }else {
          System.out.println(word2+"is greater");
      }
    }

}
