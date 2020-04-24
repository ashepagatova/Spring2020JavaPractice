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


        }

    }
