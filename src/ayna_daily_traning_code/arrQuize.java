package ayna_daily_traning_code;

import java.util.Arrays;

public class arrQuize {
    public static void main(String[] args) {
 /*char[]array = {'a','b','c','d'};
        Arrays.sort(array);
         for(char each:array){
             System.out.println(each+ " ");
             continue;
             }
  */

// int[]num1 = new int[3];
// int[]num2 ={1,2,3,4,5};
// num1=num2;
// for (int i = 0;i<num1.length;i++){
//     System.out.println(num1[i]);
// }
// int []intArr = {15,30,45,60,75};
// intArr[2]= intArr[4];
// intArr[4]= 90;
//        System.out.println(Arrays.toString(intArr));
//
//        String[]planet= {"mecury","Venus","Earth","Mars"};
//        int x =planet.length;
//        int y= planet[1].length();
//        System.out.println(x+ " "+y);

//        int arr[]= {1,2,3,4};
//        int i = 0;
//        do{
//            System.out.println(arr[i]);
//            i++;
//
//        }while (i< args.length-1);

 int wd = 0;
 String[]days = {"sun","mon","wed","sat"};
 for(int i= 0;i<days.length;i++){
     switch (days[i]){
         case "sat":
         case "sun":
             wd -=1;
             break;
         case "mon":
             wd++;
         case "wed":
             wd +=2;
     }
     System.out.println(wd);
 }


    }
}
