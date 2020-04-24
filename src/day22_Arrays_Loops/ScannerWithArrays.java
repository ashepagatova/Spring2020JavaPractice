package day22_Arrays_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerWithArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
         */

        String arr[]= new String[5];
        for(int i = 0;i<arr.length;i++){
            arr[i]=scan.next();
        }
        System.out.println(Arrays.toString(arr));

        for(String eachEll:arr){
            //String str = eachEll.substring(0,3);
          String str2  = eachEll.charAt(0)+""+ eachEll.charAt(eachEll.length()-1);
         System.out.println(str2);
}











    }
}
