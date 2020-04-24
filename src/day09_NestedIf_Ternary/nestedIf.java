package day09_NestedIf_Ternary;

public class nestedIf {
    public static void main(String[] args) {


        int age  =17;

        boolean UsCitizen = true ;
        if(UsCitizen){
             if(age >17) {
                 System.out.println("You  must  Eligible  to  vote ");


             } else {
                 System.out.println("you must be citizen ");
             }
        } else {
            System.out.println("Only US citizen  can  vote for Donald Trump");

            System.out.println("==============================");




        }   int score = 80;
        String result1 = " ";

        if(score >= 0  && score <= 100){
            //Result1 = "  "

            if(score>= 90){
                result1 = "A";

            } else if (score >=80){
                result1 ="B";

            }else if(score >=70){
                result1 = "C";

            } else if(score >= 60){
                result1 = " D";

            } else if(score >=50){
                result1 = "F";
                //System.out.println(result1);
            }


        }else{  // if score < 0 or score > 100 will exucuted
            result1 = "Invalid";
           // System.out.println(result1);


        }
        System.out.println(result1);
        System.out.println("==================================================");




        int score2 =  98 ;           // dont apply nested if to the ternary
        String grade ="";

        if(score2 > 0 && score2 <= 100){
            grade = (score>= 90) ? "A":(score >= 80)? "B": (score >=70)?("C")
                    :(score >=60)? "D" : "F";

        } else {
            grade = "invalid";
        }

        System.out.println(grade);


    }
}
