package onlyReplits;

import java.util.Scanner;

public class repil63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE Print the first word, second word, second word, first word
        System.out.print(word1.concat("")+""+word2.concat("")+""+word2.concat("")+word1.concat(""));
    }
}
