package day21_MultidementialArray;

import java.util.Arrays;

public class MultiDementinalArrays {
    public static void main(String[] args) {
        //int []  arr = {1,2,3,4};
        int [] []   arr2 = {  {1,2,3} ,{4,5,6,7} };
                             // 0        1       2
        System.out.println(arr2.length);


        int[] arr1D = arr2[0];
        System.out.println(Arrays.toString(arr2[0]));  //arr1D  or you can pass that
        int num1 = arr2[1] [3];
        System.out.println(num1);

        char [][] ch2 = {{'a','b','e','f'},{'c','d','g'},{'i','t','w'}};
        char chr =  ch2[2][2];
        System.out.println(chr);


    }
}
