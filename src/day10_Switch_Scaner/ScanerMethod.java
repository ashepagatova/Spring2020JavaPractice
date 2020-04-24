package day10_Switch_Scaner;
import java.util.Scanner;
public class ScanerMethod {
    public static void main(String[] args) {

/*

In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"


    Scanner scaner = new Scanner(System.in);

    System.out.println("Enter Three number");

    int num1 = scaner.nextInt();

    int num2 = scaner.nextInt();

    int num3 =scaner.nextInt();

    int total =(num1 + num2)+num3;

   System.out.println("Sum of numbers:  "+ num1 + " + " +num2+" + "+num3+ " = "+total);
       // System.out.println("The sum of these two numbers "+(num1+num2));



        Instructions from your teacher:
        Write a program that asks user to input int values: areaCode and localNumber.

                -Using concatenation put together in this format and assign to String phoneNumber  variable:

        -(222)-3334444

                -Write a print statement that displays (use phoneNumber variable ):
        Calling number (222)-3334444
*/


        Scanner scaner = new Scanner(System.in);

        System.out.println("enter area code");
        int areaCode = scaner.nextInt();
        System.out.println("enter local code");
        int localNumber = scaner.nextInt();

        String phoneNumber= "Calling number " + "("+areaCode+")" +(-localNumber);

        System.out.println(phoneNumber);



    }
}