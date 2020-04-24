package Office_hours.Practice_04_22_2020;

import java.util.Arrays;

public class return_Method2 {
    // write a return method that can return second max number from  int array
    public static void main(String[] args) {
        int[] arr = {123,100,200,345,456,678,89,90,10,56};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lastIndex = arr.length-1;
        int secondIndexNUm =lastIndex-1; //arr.length-1-1;
        int secondMaxNum = arr[secondIndexNUm];
        System.out.println(secondMaxNum);

        int[]arr2 = {1,2,3,4,5,6};
       int  num2 =secondMax(arr2);
        System.out.println(num2 );

    }
     public static  int secondMax (int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lastIndex = arr.length-1;
        int secondIndexNUm =lastIndex-1; //arr.length-1-1;
        int secondMaxNum = arr[secondIndexNUm];

        return secondMaxNum;
    }

}
