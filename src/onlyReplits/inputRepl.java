package onlyReplits;

import java.util.Scanner;

public class inputRepl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
     write a program that asks the user for his first name and last name.

use a scanner to get the use input.
         */
        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name:");
        String lastname =scan.nextLine();

        String fullName = firstName+""+lastname;
        System.out.println(fullName);



    }
}
