package Office_hours.Practice_04_15_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDemantionalArrays {
    public static void main(String[] args) {
        int [][] arr2D = {{1,2,3},{4,5,6,7}};
        //[index number of 2DArray],[index num of elements];
       int arr =  arr2D[1][0];
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][0]);
        //System.out.println(Arrays.deepToString(arr));
    }
}
