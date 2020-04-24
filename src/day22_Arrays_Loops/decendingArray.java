package day22_Arrays_Loops;

import java.util.Arrays;

public class decendingArray {
    public static void main(String[] args) {
        int []arr ={20,10,50,40,30,60,};
        Arrays.sort(arr); // sorts in ascending order
        System.out.println(Arrays.toString(arr));
         int []reveArr = new int [arr.length];

        int j = arr.length-1;
        for(int i  = 0;i<arr.length;i++){
            reveArr[i]= arr[j];
            j--;
        }
        System.out.println(Arrays.toString(reveArr));
    }
}
