package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArrays {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        for (int i =arr.length-1; i >= 0;i--) {
           int eachNum = arr[i];
            System.out.println(eachNum);
        }
        System.out.println("=======================");

        int [] reveArr = new int[arr.length]; // 0,0,0,0,0,
        /*reveArr[0]=arr[4];
        reveArr[1]=arr[3];
        reveArr[2]=arr[2];
        reveArr[3]=arr[1];
        reveArr[4]=arr[0];
         */
        int j = arr.length-1;
        for(int i  = 0;i<arr.length;i++){
            reveArr[i]= arr[j];
            j--;
        }
        System.out.println(Arrays.toString(reveArr));
    }
}
