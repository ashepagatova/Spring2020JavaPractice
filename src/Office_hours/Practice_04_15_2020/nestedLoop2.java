package Office_hours.Practice_04_15_2020;

import java.util.Arrays;

public class nestedLoop2 {
    public static void main(String[] args) {
        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };


        for(int j =0 ; j <numbers.length; j++ ){  // j: index nums of 1D arrays

            for(int i=0; i < numbers[j].length; i++  ){ // i: index nums of Elements

                if(numbers[j][i] % 2==0 ){
                    continue;
                }
                System.out.println( numbers[j][i] );
            }

        }

        System.out.println("=============");
        for(int[] eachArr: numbers){
            for(int eachIndex:eachArr) {
                if (eachIndex % 2 != 0) {
                    continue;
                }

            }
        }

        System.out.println(Arrays.deepToString(numbers));

    }
}
