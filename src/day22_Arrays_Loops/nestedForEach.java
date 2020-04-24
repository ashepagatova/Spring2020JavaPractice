package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class nestedForEach {
    public static void main(String[] args) {
       int[] arr ={1,2,3,4,5};
        for( int each: arr){
            System.out.println(each);
        }
        int[] [] arr1 ={{1,2,3},{4,5,6}};


        for(int[] each1: arr1){
            //System.out.println(Arrays.toString(each1));
            for(int eachElement:each1){
                System.out.println(eachElement);
            }
        }
        System.out.println("===============");

        char [][] ch1 = {{'A','B'},{'C','D','E'}};
         for(char[] ch2D:ch1){
             for(char EachChar :ch2D){
                 System.out.print(EachChar+ " ");
         }}
    }
}
