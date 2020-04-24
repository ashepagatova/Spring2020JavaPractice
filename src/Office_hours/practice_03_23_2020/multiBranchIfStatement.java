package Office_hours.practice_03_23_2020;

public class multiBranchIfStatement {

    public static void main(String[] args) {

         int number = 0;

         if(number>0){
             System.out.println("positive");  //alse

         }else if(number < 0){
             System.out.println("negative"); // false
         }else {
             System.out.println("It is zero"); //true
         }


         int num1 = 100;
         int num2 = 200;
          if(num1>num2){
              System.out.println(num1+"num 1 is greater"+num2);
          }else if(num2>num1){
              System.out.println(num2+"Num 2 is greater"+num1);

          } else{ //num1== num2
              System.out.println(num2+"both are equal"+num1);
          }
        System.out.println("=============================================================");


          String browsername = " Chrome ";
          if(browsername == "FireFox"){
              System.out.println("FireFox is open");
          } else if(browsername=="Chrome"){
              System.out.println("Chrome browser open");

          }else if( browsername== " IE Internet explor")   {

          } else if(browsername== "Safari"){
              System.out.println("Safari is open");
          } else if(browsername== "Opera"){
              System.out.println("Opera is open");
          } else{
              System.out.println("Invalid Browser name");
          }

    }
}
