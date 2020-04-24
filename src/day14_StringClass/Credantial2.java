package day14_StringClass;

import java.util.Scanner;

public class Credantial2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you user name");
        String inputUser = scan.next();
        System.out.println("Enter your passwords");
        String inputPassword =scan.next();

boolean logIn= inputUser.equals("Cybertek")&& inputPassword.equals("cybertekschool");
boolean invalidUserName = !inputUser.equals("Cyberteck")&& inputPassword.equals("cyberteckschool");
boolean invalidUserPassword = inputUser.equals("Cyberteck")&& !inputPassword.equals("cyberteckschool");
//boolean invalidUserPasswordUserName = !inputUser.equals("Cyberteck")&& !inputPassword.equals("cyberteckschool");

        if (!inputUser.isEmpty() &&!inputPassword.isEmpty()){
            if(logIn){
                System.out.println("Logged in");
            } else if(invalidUserName){
                System.out.println("User name invalid plese enter valid  user name");
            } else if(invalidUserPassword){
                System.out.println("Password invalid");
            }else {
                System.out.println("Both not inccorect");
            }
            //else if(invalidUserPasswordUserName){
                //System.out.println("Both incorret"); }
        }else{
            System.out.println("Please enter credentials");
        }
    }
}
