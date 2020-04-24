package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multi_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
         //   0,2           //   0      ,      1  ,     2
         int [][] arr2D = {{1,2,3,4,5},{1,2,4,5,6,7},{20,30,40,50,}};
         int[] arr1D = arr2D[0];

        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(arr2D[2][2]);
        System.out.println(Arrays.deepToString(arr2D));
        for(int each:arr2D[0]){
            System.out.print(each);
        }

        for(int i =0;i<arr2D[0].length;i++){
            int num = arr2D[0][i];
            System.out.println(num);

        }

    }
}
