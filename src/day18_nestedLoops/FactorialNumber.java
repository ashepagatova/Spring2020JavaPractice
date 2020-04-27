package day18_nestedLoops;
import java.util.Scanner;
public class FactorialNumber {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enetr a number");
            long num  =  scan.nextLong();  // 0
            long result = 1; // 120

            while(num >= 1){
                 result *= num;
               // result = result * num;


                num--;
            }

            System.out.println(result);
            System.out.println("==============");
            int fact=1;
            int number=5;//It is the number to calculate factorial.
            for(int i=1;i<=number;i++){
                //fact=fact*i;
                fact  *=i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);

        }

    }
