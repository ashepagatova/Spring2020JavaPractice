package day12_javaRecap;
import java.util.Scanner;

public class TerneryPracti2 {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        //System.out.println("Enter char: ");
        //String  char1 =input.next();
        char ch1 ='A';
        String result = (ch1 =='A')? "A is Selected ":(ch1=='B')?"B is selected":(ch1=='C')?
                "C is selected":(ch1=='D')?"D is valid": (ch1=='E')?"E is selected":"Invalid Character";
        System.out.println(result);




    }
}
