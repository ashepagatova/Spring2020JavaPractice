package day14_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CredentialsUser {
    public static void main(String[] args) {
       /*
        userName: cybertek
        Password: cyberteckschool
         */
       // Scanner scan = new Scanner(System.in);

        String validUsername= "cybertek";
        String validPassword ="cybertekschool";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you user name");
        String inputUser = scan.next();
        System.out.println("Enter your passwords");
        String inputPassword =scan.next();

        boolean validCredential =inputUser.equals(validUsername)&& inputPassword.equals(validPassword);

        if(validCredential){
        System.out.println(" Network is connected you can use wireless");
        } else{
        System.out.println("Invalid credentials");
         }
    }}

       /* if(inputUser.equals(validUsername) && validPassword.equals(inputPassword)){
             System.out.println("Log Sucsessfully");
         } else{
             System.out.println(" Invalid entry");
         }
        //System.out.println(validUsername+ "  " +validPassword); this is not usefull


    }
}

        */
