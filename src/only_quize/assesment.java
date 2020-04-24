package only_quize;

import java.util.Arrays;

public class assesment {
     /*
     4. creata a function that can print the maximum number from any given array
5. creata a function that can print the minimum number from any given array
6. create a function that can print out the array in descending order
      [1,2,3] == > [3,2,1]
      */
     public static void main(String[] args) {
        decendingOrder();
        maxNum();
         minNum();
     }
     public static  void decendingOrder(){
      int[] array1 = {90,80,70,60,50,40,30,20,10};
      Arrays.sort(array1);
      System.out.println(Arrays.toString(array1));

     }
     public static void maxNum(){
         int []array = {1,20,30,5,60,7,80};
          Arrays.sort(array);
          int arr = array[array.length-1];
         System.out.println(arr);

 }
        public static void minNum() {
        int[] array2 = {87,56,45,36,23,78,90,76};
        Arrays.sort(array2);
        int arr = array2[0];
        System.out.println(arr);

    }
}
