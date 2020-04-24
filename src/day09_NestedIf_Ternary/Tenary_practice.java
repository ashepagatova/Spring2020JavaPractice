package day09_NestedIf_Ternary;

public class Tenary_practice {

    public static void main(String[] args) {

        //char chr = '0'; //single charachter
       // System.out.println(chr);
      int number = 100;
      char ch1 = ' ';
      if(number >0) {
          ch1 = '+';

      }else if (number < 0){
            ch1 = '0';
      }
        System.out.println(ch1);
      char ch2 = (number >0) ?  '+': '0';
        System.out.println(ch2);
        System.out.println("======================================");

        byte score = 90;
        String grade = "";
        if (score >=90 && score <= 100){
            grade = "Exelent";
        }else if (score >= 80 && score <=90){
            grade = "Great";
        }else if (score >= 70 && score <=80){
        grade = "Good";
        }else if (score >= 60 && score <=70){
            grade = "Good";
        } else if (score >= 50 && score <=60) {
            grade = "Pass";
        }else if (score < 60 && score > 0) {
            grade = "Fail";
        } else{ // if less than 0 or grader than 100
            grade ="Invalid";
        }
        System.out.println(grade);
         String grade2 =(score >=90 && score <= 100) ? "Exelent" :
                 (score >= 80 && score <=90) ? "Great" : (score >= 60 && score <=70) ? "Good " :(score >= 60 && score <=70)? "Pass"
                         : (score < 60 && score > 0) ? "Fail" : "Invalid";
        System.out.println(grade2);
        System.out.println("=====================================================");int num = 100;
        if (num % 2 ==0){
            System.out.println("Even  num");
        } else{

            System.out.println("Odd NUm");
        }

    }


}
