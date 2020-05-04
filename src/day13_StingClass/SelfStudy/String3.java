package day13_StingClass.SelfStudy;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name name");
        String fullName = scan.nextLine();

        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

//        firstName =firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
//        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        firstName =firstName.substring(0,1).toUpperCase();
        lastName = lastName.substring(0,1).toUpperCase();

//        System.out.println("Your first name is:"+firstName);
//        System.out.println("Your last name is:".concat(lastName));

        System.out.println("Your Initials is ".concat(firstName).concat(lastName));

    }
}
