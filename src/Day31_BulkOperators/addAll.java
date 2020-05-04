package Day31_BulkOperators;

import java.util.ArrayList;
import java.util.Arrays;

public class addAll {
    public static void main(String[] args) {
        ArrayList<Integer>list1 =new ArrayList<>();
        //list1.addAll(Arrays.asList(30,40,50,60,70,80,90));
      // int[] arr1 ={30,40,50,60,70,80,90}; arrayList doesnot support primitive
        Integer[] arr1 ={30,40,50,60,70,80,90}; // it should be Object
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);
        System.out.println("============");

        String[] name = {"Maral,Jenner,Aynur,Aylar,Jemal,Jennet"};
        System.out.println(Arrays.toString(name));

        ArrayList<String> nameList = new ArrayList<>();
                                     //collection type
                          nameList.addAll(Arrays.asList(name));

                          nameList.add("Merjen");
                          nameList.remove("Jemal");

        System.out.println(nameList);
        System.out.println("=================");
        Integer [] numbers ={1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);








    }

}
