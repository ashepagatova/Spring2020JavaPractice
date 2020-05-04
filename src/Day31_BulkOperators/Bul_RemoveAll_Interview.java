package Day31_BulkOperators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bul_RemoveAll_Interview {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,3,3,3,3,3,3,3,3,3,3,3,3));
/*
        Integer a = 1;
        list.remove(a);
        Integer b = 3;
        list.remove(b);
        System.out.println(list);

 */
       // list.removeAll(Arrays.asList(3));
        System.out.println(list);

        Integer[] arr = {3,4,5,6,7};
        list.removeAll(Arrays.asList(arr));
        System.out.println(list);
        System.out.println("===========");

        //remove all the names ahmed
        String[] name = {"Ahmed","John","Ahmed","Danny","Kuku"};
        ArrayList<String> nameList = new ArrayList<>( Arrays.asList(name));
        nameList.removeAll(Arrays.asList("Ahmed"));
        System.out.println(nameList);



    }
}
