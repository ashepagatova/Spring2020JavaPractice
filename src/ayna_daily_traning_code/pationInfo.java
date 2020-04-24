package ayna_daily_traning_code;

import java.sql.SQLOutput;
import java.util.Scanner;

public class pationInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //-Create a Scanner object named scan.
        //-Display prompt "Welcome to the patient portal!"
        System.out.println("Welcome to the patient portal!");
        //-Display prompt "Please enter your personal information"
        System.out.println("Please enter your personal information");
        //-Display prompt "Enter your first name"
        System.out.println("Enter your first name");
        String firstName = scan.next();

        //-Display prompt "Enter your last name"
        System.out.println("Enter your last name");
        String lastName =scan.next();
        //-Display prompt "Enter your email" :jamesmay@gmail.com
        System.out.println("Enter your email");
        String email =scan.nextLine();
        //-Display prompt "Enter your street" //7925 Jones Branch Dr
        scan.nextLine();
        System.out.println("Enter your street");
        String street =scan.nextLine();
        //scan.nextLine();
        //-Display prompt "Enter your city"
        System.out.println("Enter your state");
        String state =scan.next();

        //Display prompt "Enter your zip code"
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        //-Display prompt "Enter your work phone number"
        System.out.println("Enter your work phone");
         long  workPhoneNumber = scan.nextLong();

       // Display prompt "Enter your personal phone number"
        System.out.println("Enter your personal phone number");
        long  personalPhoneNumber = scan.nextLong();

        //-Display prompt "Enter your age"
        System.out.println("Enter your age");
        int age= scan.nextInt();
        //-Display prompt "Enter your height" Declare 2 double variables: height, weight.

        System.out.println("Enter your height");
        double height =scan.nextDouble();
        //-Display prompt "Enter your weight"

        System.out.println("Enter your weight");
        double weight =scan.nextDouble();

         //-Display prompt "Are you married?"  ==true Declare boolean variable: isMarried (for marriage status).
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        System.out.println("Patient personal information");
       // -build fullName variable by concatenating first name and last name
        // String result = "Ship To:  "+fullName+"\n\t\t"+buildingNum+" "+streetAddress+"\n\t\t"+cityName+", "+stateName+" "+zipCode;
        String fulInfo = "Full name: "+lastName+ ","+firstName;
        //-build contacts variable by concatenating work phone, personal phone and email
        System.out.println(fulInfo);
        //Address: 7925 Jones Branch Dr, McLean, VA 22102
        String fullAdress = "Address: "+street+ "  ,"+state+"  ,"+zipcode;
        System.out.println(fullAdress);
        String contactInfo = "Contacts: work phone number -"+workPhoneNumber+", personal phone number -"+personalPhoneNumber+", email:"+email;
        System.out.println(contactInfo);
        String age1 = "Age: "+age;
        System.out.println(age1);
        String Pheights = "Height: "+height;
        System.out.println(Pheights);
        String pweights ="Weight: "+weight;
        System.out.println(pweights);
        String maritalStatus = "Married?: "+isMarried;
        System.out.println(maritalStatus);

/*



-build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, work phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true


 */





    }

}

