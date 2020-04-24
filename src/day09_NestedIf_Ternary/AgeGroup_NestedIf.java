package day09_NestedIf_Ternary;

public class AgeGroup_NestedIf {

    public static void main(String[] args) {

        /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */
    int age = 22;
    //int max = 150;
    if( age <150 && age > 0 ) {
     if (age < 21) {
            System.out.println("Teenager");
      } else if (age <55) { //(age >= 21 && age <=55)
            System.out.println("Adult");

      } else {           //else if(age >= 55)
            System.out.println("Senior");
      }
     } else {
        System.out.println("Invalid Entry");
    }
    int age2 = 45;
    String ageGroup ="";

    if(age<150 && age >0){
        ageGroup = (age2 < 21)? "Teanger" :(age2<55)? "Adult": "Senior";

    }else{
        ageGroup = "Invalid Entry";
    }

        System.out.println(ageGroup);


    }
}
