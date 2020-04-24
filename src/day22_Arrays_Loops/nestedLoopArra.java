package day22_Arrays_Loops;

import java.util.Arrays;

public class nestedLoopArra {
    public static void main(String[] args) {
        char [][] arr2D = {{'A','B','C'},{'D','E','F'},{'T','W','Y'}};
        for(int i = 0; i<arr2D[0].length;i++){
            System.out.println(arr2D[0][i]);
            //System.out.println(Arrays.deepToString(arr2D));
        }
        for(int i = 0; i<arr2D[1].length;i++){
            System.out.println(arr2D[1][i]);
            //System.out.println(Arrays.deepToString(arr2D));
        }
        for(int i = 0; i<arr2D[2].length;i++){
            System.out.println(arr2D[2][i]);
            //System.out.println(Arrays.deepToString(arr2D));
        }
        System.out.println("==============================");

         for(int j = 0; j<arr2D.length;j++){
            //System.out.println(arr2D[0][j]);
            //System.out.println(Arrays.deepToString(arr2D));
         for(int i = 0; i<arr2D[j].length;i++){
             System.out.println(arr2D[0][i]);
               //System.out.println(Arrays.deepToString(arr2D));
            }

        }



    }
}
