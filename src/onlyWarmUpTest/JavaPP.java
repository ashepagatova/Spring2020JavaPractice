package onlyWarmUpTest;
import java.util.Scanner;

public class JavaPP {
    public static void main(String[] args) {
        //DO NOT Change:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //write your CODE HERE:

        if (number > 0){
            System.out.println("Nuber is positive " +number );
        } if(number <0){
            System.out.println("Number is negative "+number);
        } if(number == 0 ){
            System.out.println("Number is zero "+number);
        }


    }
}




