package ayna_daily_traning_code;

public class Even_and_odd_number {

    public static void main(String[] args) {

        /*
        1. Write a Java program:
        2) Display whether the number is an odd number or even number.
         */
//
//        int num =31;
//          if(num % 2== 0){
//              System.out.println("its even num");
//          }  else {
//              System.out.println("Not devisiable");
//          }
//

       /* 2. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
         Write a program that declares three integers as angles and check
         whether a triangle is valid or not.
*/
       int aEqual = 30;
       int bEqual = 40;
       int cEqual = 140;
       String result =  "  ";


       if(aEqual+bEqual+cEqual ==180){
           result = "Its Equal to 180";

       } //if(aEqual+bEqual+cEqual !=180) {
          // result = "Not equal to 180";}

        else{
               result = "It not equal to 180";

       }

//        int a = 60;
//        int b =  60;
//        int c = 60;
//
//        if((a == b && a == c ) ||(b == c &&  c==a)){
//            System.out.println(" is  equal");
//        } else{
//            System.out.println("they are not  equal");
//        }

    }

}
