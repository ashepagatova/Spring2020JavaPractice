package day21_MultidementialArray.SelfStudy;

public class ForEachLoops {
    public static void main(String[] args) {
         int nums[] = {1,2,3,4,5};
        for (int eachElement:nums) {
            System.out.print(eachElement+" ");

            }
            String [] name = {"Ayshe","Merjen","Gerek"};
            for (String eachStr:name) {
                System.out.print(eachStr+" ");
        }
             int[] arr = {1,2,3,4,5,6,7,8,9,10};
             for (int eachArr:arr) {
             if(eachArr < 5 ){
                 continue;
             }
            System.out.println(eachArr);

        }
             String [] emails = {"cybertek@gmail.com","cybertek@hotmail.com","cybertek@yahoo.com"};
        for (String each:emails) {
             if(each.endsWith("@gmail.com")){
                 continue;
             }
            System.out.println(each);

        }

    }
}
