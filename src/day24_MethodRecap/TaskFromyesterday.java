package day24_MethodRecap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskFromyesterday {
    public static void main(String[] args) {
int [] arr = {10,20,30,40,50,60,70};
  maxNum(arr);
  minNum(arr);
  int []arr2 = {100,700,456,366,288,12,};
  minNum(arr2);
  maxNum(arr2);
  decending(arr);

    }public static void maxNum(int[] array){
         Arrays.sort(array);// ascending order
         System.out.println("Max number is:"+array[array.length-1]);

     }
    public static void minNum(int[] array){
        Arrays.sort(array); // Ascending order
        System.out.println("Min NUmber is:"+array[0]);

    }
    public static void decending(int []array){

        Arrays.sort(array);
       // System.out.println(Arrays.toString(array));
        for(int  i= array.length-1;i>=0;i--){
            System.out.println(array[i]+ " ");
        }
        System.out.println();
    }
}
