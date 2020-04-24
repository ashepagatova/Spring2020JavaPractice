package day21_MultidementialArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        for (int eachElement: nums) {
            System.out.println(eachElement);
        }

 String [] names = {"Ayna","Vita","Levana"};
        for (String girls :names){
            System.out.print(girls);
        }

        int [] number = {1,2,3,4,5,6,7,8,9,10,1};
         Arrays.sort(number);
        for (int all : number){
            if(all<5){
                continue;
            }
            System.out.println(all);

         System.out.println("===========================");

            String sentance = "I like Java";
           String[] word= sentance.split(" ");
          for(String EachWord:word) {
              System.out.println(EachWord);
          }
            System.out.println("====");
          for(int i = word.length-1;i>=0;i--){
              System.out.print(word[i]+" ");
          }

        }
    }
}
