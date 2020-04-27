package day29_Wraper_ArrayList;

import Resourses.Library;

import java.util.ArrayList;

public class ListPractice_2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(200);
        list.add(400);
        list.add(50);
//      int  total = list.size();
//      System.out.println(total);
        // int maxim = Integer.MIN_VALUE;
       int maxim = list.get(0);
        for (int i = 0; i <list.size() ; i++) {
           if(list.get(i)>maxim){
               maxim= list.get(i);
           }
        }
        System.out.println(maxim);
       // System.out.println(maximum2);

        int maximum3 = Integer.MIN_VALUE;
        for(Integer each: list ){
            if(each>maximum3) {
                maximum3 = each;
            }

        }

        System.out.println(maximum3);
         ArrayList<Integer> list2 = new ArrayList<>();
         list2.add(200);
         list2.add(300);
         list2.add(500);
        int maximum4 = Library.max(list2);
        System.out.println(maximum4);





    }

     public static int  max (ArrayList<Integer> list){
         int maxim = list.get(0);
         for (int i = 0; i <list.size() ; i++) {
             if(list.get(i)>maxim){
                 maxim= list.get(i);
             }
         }
          return maxim;

     }
}
