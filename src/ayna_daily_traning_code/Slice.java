package ayna_daily_traning_code;
import java.util.*;
public class Slice {


    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

// In this task, you need to slice an integer and print numbers one by one from new line.

//Create a scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Number:");
               num = scan.nextInt();
        digit1 = num / 10000;
        digit2 = (num % 10000) / 1000;
        digit3 = (num % 1000) / 100;
        digit4 = (num % 100) / 10;
        digit5 = num % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);


    }
}