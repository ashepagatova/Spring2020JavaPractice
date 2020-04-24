package day09_NestedIf_Ternary;

public class Ternary02 {
    public static void main(String[] args) {
         //ternary :? measn ? : means else ;
        String result = "";
         if (9>10){

           result= "9 is greater";
         } else{
             result = "10 is greter";
         }

        String result1 = (9>10) ? "9 is greater" : "10 is greter";
        System.out.println(result);
        System.out.println(result1);

        int age = 20;
        boolean eligibility = (age >= 21) ? true : false;
        System.out.println(eligibility);

        int ageOfPerson = 20;
        String eligiableTovote = "";

        if(ageOfPerson>= 18){
            eligiableTovote= "YES";

        } else{
            eligiableTovote= "NO";
        }
        String Elig2 = (ageOfPerson>= 18)?"YES" : "NO";

        System.out.println(eligiableTovote);

        System.out.println( Elig2);
    }
}
