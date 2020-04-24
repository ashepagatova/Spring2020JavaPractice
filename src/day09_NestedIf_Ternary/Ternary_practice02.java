package day09_NestedIf_Ternary;

public class Ternary_practice02 {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;
        int min= (num1< num2)? num1 : num2;
        System.out.println(min);


        System.out.println("========================");
int hour = 14;
String result = (hour<= 12)?"GoodMorning " : (hour >12 && hour <18) ? "Good afternoon" : "Good Evening";
        System.out.println(result);


        System.out.println("====================================================");

        int number = 12000;
        boolean didvisiableBYTwo = (number %3 ==0 && number %5 == 0)  ? true  : false;

        System.out.println(didvisiableBYTwo);
        System.out.println( " ============================================");
      int age = 40;
        String ageGroup = "";
        ageGroup = (age >=3 && age <= 0)? "Baby":(age >= 3 && age<= 5)? "Toddler":(age>= 6 && age <= 9)?"Kid":(age >=10 && age <= 12)?"Pre- Teen":
                (age >=13 &&age <=17)?"Teenager":(age >= 18 && age <= 18)?"Yong Adult":(age >= 21 && age <= 39)?"Adult":(age >= 40 && age <= 49)?"Young Middle-Aged Adult":
                        (age >= 50 && age <= 54)?" Very Young Senior Citizen":(age >= 65 && age <= 74)?" Young Senior Citizen":(age >= 75 && age <= 84)?
                                "Senior Citizen":(age >= 85 && age <= 150)?"Old Citizen":"Invalid Entry";
        System.out.println(ageGroup);

        //int age = 40;
//        String ageGroup = "";
//
//        if(age >=3 && age <= 0){
//            ageGroup = "Baby";
//        }
//        else if(age >= 3 && age<= 5){
//            ageGroup = "Toddler";
//        }else if(age>= 6 && age <= 9){
//            ageGroup = "Kid";
//        }else if (age >=10 && age <= 12){
//            ageGroup = "Pre- Teen";
//
//        } else if (age >=13 &&age <=17){
//            ageGroup = "Teenager";
//        } else if(age >= 18 && age <= 18){
//            ageGroup = "Yong Adult";
//        } else if(age >= 21 && age <=39){
//            ageGroup = "Adult";
//        } else if(age >= 40 && age <= 49) {
//            ageGroup = "Young Middle-Aged Adult";
//        }  else if(age >= 50 && age <= 54) {
//            ageGroup = " Middle-Aged Adult";
//        } else if(age >= 55 && age <= 64) {
//            ageGroup = " Very Young Senior Citizen";
//        }else if(age >= 65 && age <= 74) {
//            ageGroup = " Young Senior Citizen";
//        }else if(age >= 75 && age <= 84) {
//            ageGroup = "  Senior Citizen";
//        }else if(age >= 85 && age <= 150) {
//            ageGroup = "Old Citizen";
//        }else {
//            ageGroup= "Invalid Entry";
//        }
//        System.out.println(ageGroup);

    }
}
