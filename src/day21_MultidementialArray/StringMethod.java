package day21_MultidementialArray;

import sun.java2d.jules.TileWorker;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

//toChatArray
        String name = "Java";
        char[] chars = name.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[3]); // array size is  fixed

         String str = "I Like Java";
         String[] arr = str.split(" ");
        System.out.println( Arrays.toString(arr) );
        // revers array

//  split(value)

        String reverse = "Today is great day";
         String []words = reverse.split(" ");

        System.out.println(Arrays.toString(words));



        String result = "";
         for(int  i = words.length-1;i>= 0;i--){
           String eachWord = words[i];
             //System.out.print(eachWord+ " ");
              result +=eachWord+ " ";
         }
        System.out.println(result);
//
         String  arr1 = "ABCD";
         String empt[] = arr1.split(""); // split method
        char[] ch2 = arr1.toCharArray();
        System.out.println(Arrays.toString(empt));
        System.out.println(Arrays.toString(ch2));








    }
}
