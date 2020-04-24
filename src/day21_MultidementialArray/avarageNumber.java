package day21_MultidementialArray;

import java.text.DecimalFormat;

public class avarageNumber {
    public static void main(String[] args) {
        DecimalFormat s = new DecimalFormat("0,00");
        /*
        1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
         */
        int [] arr = {10,20,30,40,50,};
        //average:sum all number/length
        int length = arr.length; // total number of elmenet
         int sum = 0;

            for(int i = 0;i < arr.length; i++) { // = gets you last index but you dont need -1 if you dont use =
                int eachNum = arr[i];
                sum += eachNum;
            }
            double avarage = sum/(double)length;
                System.out.println(sum);
        System.out.println(s.format(avarage));
                //System.out.println(sum/(double)length);























    }
}
