package onlyReplits;

public class ternary {


    public static void main(String[] args) {
/*
* Warm up task:
	1. Wash your hand
	2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
	3. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
	4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF

*/


           int days = 2;

          String result = "";

          if(days >=1 && days <=7){
              if(days > 1){
                  result = "One";
              } else if(days ==2){
               result = "Two";
              }else if(days ==3){
                  result = "Tree";
              }else if(days == 4){
                  result= "Four";
              }else if(days == 5){
                  result = "Five";
              } else if(days== 6){
                  result = "Six";
              } else if(days ==7){
                  result = "Seven";
              }

          }else{
              result = "Try again";
          }
        System.out.println(result);

   //3. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
        //				DO NOT USE IF STATEMENTS
        //	4. write a program that can find the number of days in a month


        char ch1 = ' ';

    }
}
