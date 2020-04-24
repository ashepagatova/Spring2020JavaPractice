package day27_DateTime;

import java.util.Arrays;

public class FindMInimum {

    public static void main(String[] args) {
        int [] arr = {3,2,4,5,6,4}; // 2min number
        int minimum = arr[0]; // checking arr with
        //Arrays.sort(arr); //
        for(int each:arr){// eacch 3,2,4,5,6,4
           if(each<minimum){  //if will repead over and over again
               minimum= each; //comparing
           }
        }
        System.out.println(minimum);
        System.out.println("========");

         int [] arr2= {12,345,456,67,878,789,};
         int num = minimum(arr2);
        System.out.println(num);

        double[] arr3 = {23.9,34.8,34.6,23.5,3.4,4.3,4.2,56,56};
        double num2 = minimum(arr3);
        System.out.println(num2);

    }   public static int minimum(int [] arr){

        int minimum = arr[0]; // checking arr with
        for(int each:arr){// eacch 3,2,4,5,6,4
            if(each<minimum) {  //if will repead over and over again
                minimum = each; //comparing

            }
        }
        return minimum;


    } public  static double minimum(double [] arr) { // double takes as decimal

        double minimum = arr[0]; // if method in double we should assign in double
        for(double each:arr) {// each 3,2,4,5,6,4
            if (each < minimum) {  //if will repeat over and over again
                minimum = each; //comparing
            }
        }
        return minimum;
    }
}
