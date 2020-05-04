package Day31_BulkOperators;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkContainsAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
/*
        boolean r1 = list1.contains(10);
        boolean r2 = list1.contains(20);
        boolean r3 = list1.contains(60);

        boolean result = r1 == true && r2 == true  &&r3 == true; // this good if you want check by one
        System.out.println(result);

 */
         boolean result2 = list1.containsAll(Arrays.asList (20,30,40) );// doesn't care about order
       // we can check if given list are contain or not and just passing into parameter
         System.out.println(result2);
         Integer [] data = {20,30,40};
         boolean result3 = list1.containsAll(Arrays.asList (20,30,40) ); // add ArrayList chrck if list contains given num
         System.out.println(result3);



    }
}
