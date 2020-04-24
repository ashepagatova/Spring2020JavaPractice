package day17_WhileLoop;

import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        int maxNum =-999999999;// any number user providet than this num
         //fist user entered variable will be initialzed to ManNum
        int minNumber = 199999999;
            for (int i =1;i<6;i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
             int num= input.nextInt();
             if(num>maxNum){ //to compare eachuser input and assign to max Number
                 maxNum= num;
             }
             if(num<minNumber){
                 minNumber=num;
             }
        }

        System.out.println("Maximum number "+maxNum);
        System.out.println("Minumum number "+minNumber);
    }
}
