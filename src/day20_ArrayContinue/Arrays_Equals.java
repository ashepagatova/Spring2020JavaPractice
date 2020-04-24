package day20_ArrayContinue;

import java.util.Arrays;

public class Arrays_Equals {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] arr2 ={1,2,3};

        boolean result1 = Arrays.equals(arr1,arr2);
        System.out.println(result1);

        int[] arr3 ={3,2,1};
        int[] arr4 ={1,2,3};

        boolean result2 = Arrays.equals(arr3,arr4);
        System.out.println(result2);

        int[] arr5 ={3,2,1};
        int[] arr6 ={3,1,2};
        Arrays.sort(arr5);
        Arrays.sort(arr6);

        boolean result3 = Arrays.equals(arr5,arr6);
        System.out.println(result3);

        int[] arr7 ={3,2,1,9,6,5,4,7};
        int[] arr8 ={3,1,2};

        boolean result4 = Arrays.equals(arr7,arr8);
        System.out.println(result4);


    }
}
