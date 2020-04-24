package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class evenNumberArr {
    public static void main(String[] args) {
        /*
         1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to pint out all the even numbers.
                Must use continue statement
         */
         int [] numbers = new int[200];
         for(int i = 0 ;i < numbers.length;i++){
           numbers[i]  = i+1; // assign to the array

         }

        System.out.println(Arrays.toString(numbers));
         for(int eachArr:numbers){
             if(eachArr%2==0)
                 continue;
             System.out.print(eachArr+" ");
         }

    }
}
