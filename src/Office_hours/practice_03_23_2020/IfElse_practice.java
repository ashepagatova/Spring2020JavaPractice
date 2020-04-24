package Office_hours.practice_03_23_2020;

public class IfElse_practice {
    public static void main(String[] args) {
        int num =200;

        /*if(num % 2 !=0){ //odd condition

            System.out.println("Odd");
        } if(num%2 ==0){
            System.out.println("Even");
        } else{
            System.out.println("Invalid");
        }
        */

        if(num % 2 !=0){ //odd number
            System.out.println(num+"Odd Number");
        } else {
            System.out.println(num+ " is Even Number");
        }

         int age = 21;
         if(age  >=21){
             System.out.println("Here your deadly  spirit :D");
         }else{
             System.out.println("Go drink milk :D");
         }
        boolean genderMale = true;
         if(genderMale){
             System.out.println("Gender male");
         }else{
             System.out.println("Gender is female");
         }

         boolean usCitizen =true;
         int ageOfPerson = 30;
          if(usCitizen==true || ageOfPerson>=18){
              System.out.println("Go Vote your eligible");
          } else{
              System.out.println("Go home be 18 and get your citizenship");
          }


    }


}
