package day09_NestedIf_Ternary;

public class NestedIfTaskLoan {
    public static void main(String[] args) {

     double salary = 120000;
     byte workHistory = 3;
     if(salary >= 30000){  // might be qualify
     if(workHistory>= 2){
      System.out.println("You are quailfy for loan");
      } else {
       System.out.println("Person dont have work history");
       }
         } else {
             System.out.println("Your must  earn 30.000 salary");
         }








    }
}
