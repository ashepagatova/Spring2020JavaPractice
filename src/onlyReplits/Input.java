package onlyReplits;

import java.util.Scanner;

public class Input {
    /*
    Instructions from your teacher:
write a program that asks the user for his first name and last name.

use a scanner to get the use input. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and last name");
        String firstName=scan.next();
        //scan.nextLine();
        String lastName=scan.next();

    }
}
