package day24_MethodRecap;

import java.util.Scanner;
public class MaxNuminMethod {

           public static void maxMin(int num1, int num2) {


            if (num1 > num2) {
                System.out.println(num1 + " is greader ");
            }
            if (num2 > num1) {
                System.out.println(num2 + "i s greatder");
            } else {
                System.out.println("invalid Entry");
            }


        }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        maxMin(a, b);

        int  a1 = 10;
        int b1 = 3;

while(true ) {
    calc(2, 4, '*');
    calc(a1, b1, '/'); // you can pass to

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = scan.nextInt();
    System.out.println("Enter second number:");
    int num2 = scan.nextInt();
    System.out.println("Enter the operator:");
    char operator = scan.next().charAt(0); // result calculation
    calc(num1, num2, operator);
    System.out.println("Do you want a continue?");
    String answer = scan.next();

    while (!answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
        System.out.println("Please re-enter ");
        System.out.println("Do you want continue?");
        answer = scan.next();
    }

    if (answer.equalsIgnoreCase("NO")) {
        break;
    }
}


    }

    public static void calc(double n1, double n2, char operator) {
        switch (operator) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;

            case '/':
                System.out.println(n1 / n2);
                break;
            case '%':
                System.out.println(n1 % n2);
                break;
            default:
                System.out.println("Invalid Entry");
               //  System.exit(0);

        }



    }
}