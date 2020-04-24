package day17_WhileLoop;

import java.util.Scanner;

public class calculator {
    /*
    4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
for(int i=0; i==0;) {
    System.out.println("Enter fist Number");
    int num = scan.nextInt();
    System.out.println("Enter fist Number");
    int num1 = scan.nextInt();
    System.out.println("Math operator:");
    //char operator=scan.next().charAt(0);
   // if(operatoe=='+')
    String operato2 = scan.next();
    if (operato2.equals("+")) {
        System.out.println("Addition is:" + (num + num1));
    } else if (operato2.equals("-")) {
        System.out.println("Substruction is:" + (num - num1));
    } else if (operato2.equals("*")) {
        System.out.println("Multiplication is:" + (num * num1));
    } else if (operato2.equals("/")) {
        System.out.println("Devision is:" + (num / num1));
    } else if (operato2.equals("%")) {
        System.out.println("Remeinder  is:" + (num % num1));
    } else {
        System.out.println("Invalid operators");
    }

    System.out.println("Do you wanna continue");
    String answer = scan.next();
    if(answer.equalsIgnoreCase("No")){
        System.out.println("Thank you for using calculater");
        break;
    }
}
    }

}
