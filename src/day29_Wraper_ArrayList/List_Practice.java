package day29_Wraper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppinList = new  ArrayList<>();
        shoppinList.add("Milk");//size 1
        shoppinList.add("Coffee");//size  2
        shoppinList.add("Tea");//size 3
        shoppinList.add("Bread");//size 4
        shoppinList.add("Egg");//size 5

        System.out.println(shoppinList);
        for (int i = 0; i <shoppinList.size() ; i++) {
            System.out.println(shoppinList.get(i));
                }/*
        System.out.println(shoppinList.get(0));
        System.out.println(shoppinList.get(1));
        System.out.println(shoppinList.get(2));
        System.out.println(shoppinList.get(3));

             */

        System.out.println("==============");

        for (String each :shoppinList) {
        System.out.println(each);
        }
         int size = shoppinList.size();
         System.out.println(size);
         int  lastIndex = shoppinList.size()-1;
        System.out.println(lastIndex);



    }


}
