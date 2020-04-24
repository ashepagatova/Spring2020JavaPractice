package day10_Switch_Scaner;

import java.util.Scanner;
public class ScanerClassPractice {

    public static void main(String[] args) {

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter one");
        short num1 = input2.nextShort();

        System.out.println("Enter two");

        short num2 = input2.nextShort();

        int total =(num1 + num2);
        System.out.println("The sum of "+ num1 + " and " +num2+" is: " +total);
        System.out.println("The sum of these two numbers "+(num1+num2));

    }
}