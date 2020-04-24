package day10_Switch_Scaner;

public class days {

    public static void main(String[] args) {

         /*Warm up task:
        1. Wash your hand
        2. write a program that can display the days based on the numbers 1 ~ 7
        MUST USE NESTED IF */

         int num = 9;
         String   result = "";
         String result2 = "";

         if(num>=1 && num<=7){// (num>0 && num<8)
             if( num == 1){
              result = "Monday";
            } else if(num==2){
                 result = "Tuesday";
            } else if(num ==3){
                 result= "Wednesday";
            }  else if(num== 4){
                 result = "Thursday";
             }else if(num ==5){
                 result = "Friday";
             } else if(num == 6){
                 result = "Saturday";
             } else{
                 result= "Sunday";
             }


         } else{
             result = "Invalid Entry";
         }

        System.out.println(result);




      result2 =  (num ==1) ? "Monday" :(num==2)? "Tuesday":(num ==3)? // in ternery we must have ? : equal
              "Wednesday":(num==4)? "Thursday":(num==5)?"Friday":(num ==6)?
              "Saturday":(num ==7)? "Sunday" : "Invalid Entry";

        System.out.println(result2);


String result3 = "";
if(num >0 && num < 8){

    result3 =  (num ==1) ? "Monday" :(num==2)? "Tuesday":(num ==3)? // in ternery we must have ? : equal
            "Wednesday":(num==4)? "Thursday":(num==5)?"Friday":(num ==6)?
            "Saturday":"Sunday" ;

}else{
     result3 = "Invalid" ;
}


    }
}
