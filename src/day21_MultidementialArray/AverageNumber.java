package day21_MultidementialArray;

import java.text.DecimalFormat;

public class AverageNumber {



            public static void main(String[] args) {
                DecimalFormat DF = new DecimalFormat("0.00");

                double[] arr = {1, 2, 2};  //5, 10
                // average: sum of all numbers / length

                int length = arr.length; // total number of the elements

                double sum = 0;

                for(int i = 0; i < length; i++  ){
                    double eachNum =  arr[i];
                    sum +=  eachNum;
                }

                System.out.println(sum);

                double average = sum/length;
                System.out.println(average);
                System.out.println(DF.format( average ) );

        /*
                [2,1,3] ==> 6
                [1,2,3] ==> 6
         */

/*
        int[] arr2 = {1,2,2}; // 5/3 =
        System.out.println( 5/3 );
        System.out.println( 5/(double)3);
*/





















    }
}
