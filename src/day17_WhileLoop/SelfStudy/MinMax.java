package day17_WhileLoop.SelfStudy;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        //maxand min

        Scanner scn = new Scanner(System.in);
        int maxNumber =-999999999;
        int minNumber = 99999999;
        for (int i = 0; i < 6 ; i++) {
        System.out.println("Enter Number ");
        int num = scn.nextInt();
        if(num > maxNumber){
            maxNumber=num;
        } if(num < minNumber){
            minNumber= num;
            }


        }
        System.out.println("Max Number is "+maxNumber);
        System.out.println("Min Number is "+minNumber);

    }
}
