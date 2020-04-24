package day12_javaRecap;
import java.util.Scanner;

public class TernaryPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Status Code:" );
        int statusCode = scan.nextInt();
        String result = "";


        if(statusCode ==200){
            result = "ok";
        }else if(statusCode ==201){
            result= "Created";
        }else if(statusCode==202){
            result="Accepted";
        }else{
            result = "Invalid Status Code";
        }
        System.out.println(result);

        String total = (statusCode == 200)? "Ok": (statusCode==201)?"Created":(statusCode ==202)?"Accepted":"Invalid";

        System.out.println(total);



       // write a program that asks to enter 5 numbers and prints the numbers in ascending order (smallest to largest)






    }


}
